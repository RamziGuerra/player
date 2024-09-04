package com.example.intervenantapi.repository;

import com.example.intervenantapi.model.Intervenant;
import com.example.intervenantapi.dto.HistoriqueDTO;
import com.example.intervenantapi.dto.IntervenantDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IntervenantRepository extends JpaRepository<Intervenant, Long> {

    @Query("SELECT new com.example.intervenantapi.dto.IntervenantDTO(i.name, i.lastName, t.libelle, i.licenceNum, i.dateOfBirth, p.libelle) " +
           "FROM Intervenant i " +
           "JOIN i.intervenantType t " +
           "JOIN i.pays p " +
           "WHERE i.licenceNum = :licenceNum")
    IntervenantDTO findIntervenantByLicenceNum(String licenceNum);

    @Query("SELECT new com.example.intervenantapi.dto.HistoriqueDTO(d.name, t.initials, pc.label, ti.ctSeasonId, ip.photoBdata) " +
           "FROM TeamIntervenants ti " +
           "JOIN ti.team t " +
           "JOIN ti.playerCategory pc " +
           "JOIN ti.teamDivision td " +
           "JOIN td.division d " +
           "LEFT JOIN ti.intervenantPhotos ip " +
           "WHERE ti.intervenant.licenceNum = :licenceNum " +
           "ORDER BY ti.ctSeasonId ASC, pc.label ASC")
    List<HistoriqueDTO> findHistoriqueByLicenceNum(String licenceNum);
}
