package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Classe gerada para cumprir a persisencia do relacionamento

public class DaoJogadorPersonagem {
	String url = "jdbc:mysql://localhost/streetfighter";
	String user = "root";
	String pwd = "root";
	
	public void cadastrar(int jogador, int personagem) {
		String query = String.format(""
				+ "INSERT INTO JOGADOR_PERSONAGEM"
				+ "(jogador, personagem) VALUES"
				+ "(%s, %s);", jogador, personagem);
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement comm = conn.prepareStatement(query);
			comm.execute();			
			
		} catch (SQLException e) {
			System.out.println("Falha na persistência dos relacionamento entre"
					+ " Jogador e Personagem.");
		}		
	}
}
