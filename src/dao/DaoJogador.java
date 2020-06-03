package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dominio.Jogador;

public class DaoJogador {
	String url = "jdbc:mysql://localhost/streetfighter";
	String user = "root";
	String pwd = "root";
	
	public void cadastrar(Jogador jogador) {
		String query = String.format(""
				+ "INSERT INTO JOGADOR"
				+ "(nome, totalPontos) VALUES"
				+ "('%s', %s);", jogador.getNome(), jogador.getTotalPontos());
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement comm = conn.prepareStatement(query);
			comm.execute();			
			
		} catch (SQLException e) {
			System.out.println("Falha na persistência dos dados do Jogador.");
		}
	}
	
	public int getId() {
		String query = String.format("SELECT MAX(id) FROM JOGADOR;");
		int id = 0;
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement comm = conn.prepareStatement(query);
			ResultSet rs = comm.executeQuery();
			
			rs.first();
			
			id = (int)rs.getObject(1);
			
		} catch (SQLException e) {
			System.out.println("Falha na busca dos dados do Jogador.");
		}
		
		return id;
	}
}
