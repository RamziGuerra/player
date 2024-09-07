package com.sts.player.dto;

import java.time.LocalDate;

public class IntervenantDTO {
    private String division;
    private String teamInitial;
    private String teamName;
    private String typeInterv;
    private String numLicence;
    private String name;
    private String lastName;
    private LocalDate dateNaissance;
    private String nationalite;
    private String categorie;
    private String playerNum;
    private String season;
    private byte[] photo;

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

    public String getNumLicence() {
        return numLicence;
    }

    public void setNumLicence(String numLicence) {
        this.numLicence = numLicence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
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

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
