package com.fr.adaming.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Epreuve implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEpreuve; 
	private String date; 
	private String heure;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Eleve> eleves; 
	
	@OneToOne
	private Laboratoire laboratoire; 
	
	@OneToOne
	private Matiere matiere; 
	
	
	
	public Epreuve() {
		super();
	}


	public Epreuve(String date, String heure) {
		super();
		this.date = date;
		this.heure = heure;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getHeure() {
		return heure;
	}


	public void setHeure(String heure) {
		this.heure = heure;
	}


	@Override
	public String toString() {
		return "Epreuve [idEpreuve=" + idEpreuve + ", date=" + date + ", heure=" + heure + "]";
	} 
	
	

}
