package com.sts.player.entity;

import java.time.LocalDate;

import jakarta.persistence.*;



@Entity
@Table(name = "ct_intervenants", schema = "sss_competition_db")
public class Intervenant {
    @Id
    @Column(name = "ct_intervenant_id")
    private Long id;

    @Column(name = "licence_num")
    private String numLicence;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateNaissance;

    @ManyToOne
    @JoinColumn(name = "cr_pays_id")
    private Pays nationalite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Pays getNationalite() {
		return nationalite;
	}

	public void setNationalite(Pays nationalite) {
		this.nationalite = nationalite;
	}

 
}
