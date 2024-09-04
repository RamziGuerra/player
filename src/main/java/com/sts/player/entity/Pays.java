package com.sts.player.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "cr_pays", schema = "sss_competition_db")
public class Pays {
    @Id
    @Column(name = "cr_pays_id")
    private Long id;

    @Column(name = "libelle")
    private String libelle;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

   
}
