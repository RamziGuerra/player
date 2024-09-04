package com.sts.player.controller;

import com.sts.player.dto.IntervenantResponse;
import com.sts.player.service.IntervenantService;
import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/intervenant")
public class IntervenantController {
    @Autowired
    private IntervenantService intervenantService;

    @GetMapping(value = "/{licenceNum}")
    public List<Object[]> getIntervenantWithHistory(@PathVariable String licenceNum) {
    	List<Object[]> response = intervenantService.getIntervenantWithHistory(licenceNum);
        return response;
    }
    @GetMapping
    public String getIntervenantWithHistory2() {
        //IntervenantResponse response = intervenantService.getIntervenantWithHistory(licenceNum);
        return "aaaa";
    }
    
}
