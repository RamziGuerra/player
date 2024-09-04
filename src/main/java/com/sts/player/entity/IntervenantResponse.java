package com.sts.player.entity;

import java.util.List;

import com.sts.player.dto.HistoriqueDTO;
import com.sts.player.dto.IntervenantDTO;

public class IntervenantResponse {
    private IntervenantDTO intervenant;
    private List<HistoriqueDTO> historique;
	public IntervenantDTO getIntervenant() {
		return intervenant;
	}
	public void setIntervenant(IntervenantDTO intervenant) {
		this.intervenant = intervenant;
	}
	public List<HistoriqueDTO> getHistorique() {
		return historique;
	}
	public void setHistorique(List<HistoriqueDTO> historique) {
		this.historique = historique;
	}

 
}