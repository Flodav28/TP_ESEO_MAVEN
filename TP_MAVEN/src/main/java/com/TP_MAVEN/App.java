package com.TP_MAVEN;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.TP_MAVEN.controlleur.ReadCSV;
import com.TP_MAVEN.modele.Ville;

/**
 * Hello world!
 *
 */
public class App 
{
	public final static String  FILENAME = "src/main/ressources/laposte_hexasmal.csv";

    public static void main( String[] args )
    {
    	ReadCSV rdCSV = new ReadCSV(FILENAME);
    	rdCSV.read();
    	sendVille(rdCSV.getlVille());
    }
    public static Connection connect() throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/maven";
        String ur="jdbc:mysql://localhost/maven?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Connection conn = null;
        try {
            conn = (Connection) DriverManager.getConnection(ur, "flodav", "flodav");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
	public static void sendVille(List<Ville> lVille) {
		String sql = "INSERT  INTO VILLE_FRANCE1 (Code_commune_INSEE,Nom_commune,Code_postal,Libelle_acheminement,Ligne_5,Coordonnees_gps) VALUES(?,?,?,?,?,?)";

		
			try {
				for(Ville ville :lVille) {
					Connection conn = connect();
					PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);		
					ps.setString(1,ville.getCode_commune());
					ps.setString(2,ville.getNom_commune());
					ps.setString(3, ville.getCode_postal());
					ps.setString(4, ville.getLibelle_acheminement());
					ps.setString(5, ville.getLigne_5());
					ps.setString(6, ville.getCoordonnees_gps());
					ps.executeUpdate();
				}
			} catch (SQLException | ClassNotFoundException e ) {
			            System.out.println(e.getMessage());
			}	
			
		
		
		
	}
    
}
