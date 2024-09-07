package com.sts.player.controller;

import com.sts.player.entity.IntervenantResponse;
import com.sts.player.service.IntervenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/intervenant")
public class IntervenantController {
    @Autowired
    private IntervenantService intervenantService;

    @GetMapping(value = "/{licenceNum}")
    public IntervenantResponse getIntervenantWithHistory(@PathVariable String licenceNum) {
    	IntervenantResponse response = intervenantService.getIntervenantWithHistory(licenceNum);
        return response;
    }
    @GetMapping
    public String getIntervenantWithHistory2() {
        //IntervenantResponse response = intervenantService.getIntervenantWithHistory(licenceNum);
        return "aaaa";
    }
    
}
