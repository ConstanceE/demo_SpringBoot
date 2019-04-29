package com.fr.adaming.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Laboratoire implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLabo; 
	private String nomLabo; 
	private int nbrOrdi;
	
	@OneToOne
	private Epreuve epreuve; 
	
	
	public Laboratoire() {
		super();
	}



	public Laboratoire(String nomLabo, int nbrOrdi) {
		super();
		this.nomLabo = nomLabo;
		this.nbrOrdi = nbrOrdi;
	}







	public int getIdLabo() {
		return idLabo;
	}



	public void setIdLabo(int idLabo) {
		this.idLabo = idLabo;
	}



	public Epreuve getEpreuve() {
		return epreuve;
	}



	public void setEpreuve(Epreuve epreuve) {
		this.epreuve = epreuve;
	}



	public String getNomLabo() {
		return nomLabo;
	}



	public void setNomLabo(String nomLabo) {
		this.nomLabo = nomLabo;
	}



	public int getNbrOrdi() {
		return nbrOrdi;
	}



	public void setNbrOrdi(int nbrOrdi) {
		this.nbrOrdi = nbrOrdi;
	}



	@Override
	public String toString() {
		return "Laboratoire [idLabo=" + idLabo + ", nomLabo=" + nomLabo + ", nbrOrdi=" + nbrOrdi + "]";
	}



	
	
	

}
