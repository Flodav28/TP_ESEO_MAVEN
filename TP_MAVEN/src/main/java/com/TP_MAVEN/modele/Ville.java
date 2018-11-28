package com.TP_MAVEN.modele;

public class Ville {
	
	private String code_commune;
	private String nom_commune;
	private String code_postal;
	private String  libelle_acheminement;
	private String ligne_5;
	private String coordonnees_gps;
	
	public Ville() {
		
	}
	public Ville(String code_commune,String nom_commune,String code_postal,String  libelle_acheminement,String ligne_5,String coordonnees_gps) {
		this.code_commune=code_commune;
		this.nom_commune=nom_commune;
		this.code_postal=code_postal;
		this.libelle_acheminement=libelle_acheminement;
		this.ligne_5=ligne_5;
		this.coordonnees_gps=coordonnees_gps;
	}


	public String getCode_commune() {
		return code_commune;
	}


	public void setCode_commune(String code_commune) {
		this.code_commune = code_commune;
	}


	public String getNom_commune() {
		return nom_commune;
	}


	public void setNom_commune(String nom_commune) {
		this.nom_commune = nom_commune;
	}


	public String getCode_postal() {
		return code_postal;
	}


	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}


	public String getLibelle_acheminement() {
		return libelle_acheminement;
	}


	public void setLibelle_acheminement(String libelle_acheminement) {
		this.libelle_acheminement = libelle_acheminement;
	}


	public String getLigne_5() {
		return ligne_5;
	}


	public void setLigne_5(String ligne_5) {
		this.ligne_5 = ligne_5;
	}


	public String getCoordonnees_gps() {
		return coordonnees_gps;
	}


	public void setCoordonnees_gps(String coordonnees_gps) {
		this.coordonnees_gps = coordonnees_gps;
	}

}
