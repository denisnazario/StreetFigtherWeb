package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dominio.Personagem;

public class DaoPersonagem {
	String url = "jdbc:mysql://localhost/streetfighter";
	String user = "root";
	String pwd = "root";
	
	public void cadastrar(Personagem personagem, int golpe, int magia) {
		String query = String.format(""
				+ "INSERT INTO PERSONAGEM"
				+ "(nome, sexo, pais, golpe, magia) VALUES"
				+ "('%s', '%s', '%s', %s, %s);",
				personagem.getNome(), personagem.getSexo(),
				personagem.getPais(), golpe, magia);
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement comm = conn.prepareStatement(query);
			comm.execute();			
			
		} catch (SQLException e) {
			System.out.println("Falha na persistência dos dados de Personagem.");
		}
	}
	
	public int getId() {
		String query = String.format("SELECT MAX(id) FROM PERSONAGEM;");
		int id = 0;
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement comm = conn.prepareStatement(query);
			ResultSet rs = comm.executeQuery();
			
			rs.first();
			
			id = (int)rs.getObject(1);
			
		} catch (SQLException e) {
			System.out.println("Falha na busca dos dados de Personagem.");
		}
		
		return id;
	}
	
}
