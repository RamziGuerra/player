package com.sts.player.dto;

import java.time.LocalDate;

public class IntervenantDTO {
    private String name;
    private String lastName;
    private String typeInterv;
    private String numLicence;
    private LocalDate dateNaissance;
    private String nationalite;
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

  
}