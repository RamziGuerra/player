package com.sts.player.service;

import com.sts.player.dto.IntervenantResponse;
import com.sts.player.repository.IntervenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntervenantService {
    @Autowired
    private IntervenantRepository intervenantRepository;

    public List<Object[]> getIntervenantWithHistory(String licenceNum) {
        List<Object[]> results = intervenantRepository.findIntervenantWithHistory(licenceNum);
        IntervenantResponse response = new IntervenantResponse();
        
        if (!results.isEmpty()) {
            Object[] firstRow = results.get(0);
            // Mappez les résultats SQL aux objets DTO
            // ...
        }
        
        return results;
    }
}