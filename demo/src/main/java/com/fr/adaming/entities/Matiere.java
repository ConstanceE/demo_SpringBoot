package com.fr.adaming.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Matiere implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMatiere; 
	private String libelle; 
	private float duree; 
	private float coefficient;
	
	@OneToOne
	private Epreuve epreuve; 
	
	@ManyToOne
	private Section section; 
	
	public Matiere() {
		super();
	}


	public Matiere(String libelle, float duree, float coefficient) {
		super();
		this.libelle = libelle;
		this.duree = duree;
		this.coefficient = coefficient;
	}





	public int getIdMatiere() {
		return idMatiere;
	}


	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}


	public Epreuve getEpreuve() {
		return epreuve;
	}


	public void setEpreuve(Epreuve epreuve) {
		this.epreuve = epreuve;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public float getDuree() {
		return duree;
	}


	public void setDuree(float duree) {
		this.duree = duree;
	}


	public float getCoefficient() {
		return coefficient;
	}


	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}


	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", libelle=" + libelle + ", duree=" + duree + ", coefficient="
				+ coefficient + "]";
	}


	
	

}
