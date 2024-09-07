package com.sts.player.service;

import com.sts.player.dto.HistoriqueDTO;
import com.sts.player.dto.IntervenantDTO;
import com.sts.player.entity.IntervenantResponse;
import com.sts.player.repository.IntervenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class IntervenantService {
    @Autowired
    private IntervenantRepository intervenantRepository;

    public IntervenantResponse getIntervenantWithHistory(String licenceNum) {
        List<Object[]> resultsDatabase = intervenantRepository.findIntervenantWithHistory(licenceNum);
        IntervenantResponse result = new IntervenantResponse();
        
        result = convertToIntervenantResponse(resultsDatabase);
        
        return result;
    }
    public IntervenantResponse convertToIntervenantResponse(List<Object[]> results) {
        IntervenantResponse response = new IntervenantResponse();
        IntervenantDTO intervenantDTO = null;
        List<HistoriqueDTO> historiqueList = new ArrayList<>();

        for (Object[] result : results) {
            // Extraction des données depuis le résultat
            String division = (String) result[0];
            String teamInitial = (String) result[1];
            String teamName = (String) result[2];
            String typeInterv = (String) result[3];
            String numLicence = (String) result[4];
            String name = (String) result[5];
            String lastName = (String) result[6];
            LocalDate dateNaissance = (LocalDate) result[7];
            String nationalite = (String) result[8];
            String categorie = (String) result[9];
            String playerNum = (String) result[10];
            String season = (String) result[11];
            byte[] photo = (byte[]) result[12];

            // Si l'intervenantDTO n'a pas encore été créé, nous le créons
            if (intervenantDTO == null) {
                intervenantDTO = new IntervenantDTO();
                intervenantDTO.setDivision(division);
                intervenantDTO.setTeamInitial(teamInitial);
                intervenantDTO.setTeamName(teamName);
                intervenantDTO.setTypeInterv(typeInterv);
                intervenantDTO.setNumLicence(numLicence);
                intervenantDTO.setName(name);
                intervenantDTO.setLastName(lastName);
                intervenantDTO.setDateNaissance(dateNaissance);
                intervenantDTO.setNationalite(nationalite);
                intervenantDTO.setCategorie(categorie);
                intervenantDTO.setPlayerNum(playerNum);
                intervenantDTO.setSeason(season);
                intervenantDTO.setPhoto(photo);
            }

            // Création d'un HistoriqueDTO pour chaque ligne du résultat
            HistoriqueDTO historiqueDTO = new HistoriqueDTO();
            historiqueDTO.setDivision(division);
            historiqueDTO.setTeamInitial(teamInitial);
            historiqueDTO.setTeamName(teamName);
            historiqueDTO.setTypeInterv(typeInterv);
            historiqueDTO.setCategorie(categorie);
            historiqueDTO.setPlayerNum(playerNum);
            historiqueDTO.setSeason(season);

            historiqueList.add(historiqueDTO);
        }

        // Ajout des objets à la réponse
        response.setIntervenant(intervenantDTO);
        response.setHistorique(historiqueList);

        return response;
    }

}