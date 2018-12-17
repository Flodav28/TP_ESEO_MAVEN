package com.TP_MAVEN.controlleur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.TP_MAVEN.modele.Ville;

public class ReadCSV {
	
	private String pathCSV;
	private List<Ville> lVille;
	
	public ReadCSV(String path) {
		this.pathCSV=path;
		this.lVille=new ArrayList<>();
	}
	
	public void read()  {
		//String fileName = "src/main/resources/laposte_hexasmal.csv";
		
		Ville ville;
        String csvFile = "/Users/mkyong/csv/country.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        try {	
            br = new BufferedReader(new FileReader(this.pathCSV));
            while ((line = br.readLine()) != null) {

                if(!line.contains("Code_commune"))
                {
                	String[]listeElementVille = line.split(cvsSplitBy);
                	//System.out.println(line);
              	   int lenght =listeElementVille.length;
              	   if(lenght==6) {
                    	   ville = new Ville();
                    	   ville.setCode_commune(listeElementVille[0]);
                    	   ville.setNom_commune(listeElementVille[1]);
                    	   ville.setCode_postal(listeElementVille[2]);
                    	   ville.setLibelle_acheminement(listeElementVille[3]);
                    	   ville.setLigne_5(listeElementVille[4]);
                    	   ville.setCoordonnees_gps(listeElementVille[5]);
                    	   this.lVille.add(ville);
                       }
              	   } 
                }
         	     
		} catch (IOException e) {
			e.printStackTrace();
		}
	     
        
	}

	public List<Ville> getlVille() {
		// TODO Auto-generated method stub
		return this.lVille;
	}
	public void setlVille(List<Ville> lVille) {
		// TODO Auto-generated method stub
		 this.lVille=lVille;
	}

    
	
	

}
