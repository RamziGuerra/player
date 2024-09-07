package com.sts.player.dto;

public class HistoriqueDTO {
    private String division;
    private String teamInitial;
    private String teamName;
    private String typeInterv;
    private String categorie;
    private String playerNum;
    private String season;

    // Getters and Setters
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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTypeInterv() {
        return typeInterv;
    }

    public void setTypeInterv(String typeInterv) {
        this.typeInterv = typeInterv;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(String playerNum) {
        this.playerNum = playerNum;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}