package com.sts.player.dto;

public class HistoriqueDTO {
    private String division;
    private String teamInitial;
    private String categorie;
    private Integer season;
    private String photo;
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getTeamInitial() {
		return teamInitial;
	}
	public void setTeamInitial(String teamInitial) {
		this.teamInitial = teamInitial;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public Integer getSeason() {
		return season;
	}
	public void setSeason(Integer season) {
		this.season = season;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

    
}