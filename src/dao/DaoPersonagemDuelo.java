package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Classe gerada para cumprir a persisencia do relacionamento

public class DaoPersonagemDuelo {
	String url = "jdbc:mysql://localhost/streetfighter";
	String user = "root";
	String pwd = "root";
	
	public void cadastrar(int personagem, int duelo) {
		String query = String.format(""
				+ "INSERT INTO PERSONAGEM_DUELO"
				+ "(personagem, duelo) VALUES"
				+ "(%s, %s);", personagem, duelo);
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement comm = conn.prepareStatement(query);
			comm.execute();			
			
		} catch (SQLException e) {
			System.out.println("Falha na persistência dos relacionamento entre"
					+ " Personagem e Duelo.");
		}
	}
}
