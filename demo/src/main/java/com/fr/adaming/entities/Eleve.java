package com.fr.adaming.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Eleve implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEleve; 
	private String nom; 
	private String prenom;
	private String dateNaissance; 
	private String section;
	
	
	@ManyToOne
	private Epreuve epreuve; 
	
	
	
	public Eleve() {
		super();
	}





	public Eleve(String nom, String prenom, String dateNaissance, String section) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.section = section;
	}




	public Long getIdEleve() {
		return idEleve;
	}


	public void setIdEleve(Long idEleve) {
		this.idEleve = idEleve;
	}

	public Epreuve getEpreuve() {
		return epreuve;
	}


	public void setEpreuve(Epreuve epreuve) {
		this.epreuve = epreuve;
	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	public String getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}




	@Override
	public String toString() {
		return "Eleve [idEleve=" + idEleve + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", section=" + section + "]";
	}





	
	
	

}
