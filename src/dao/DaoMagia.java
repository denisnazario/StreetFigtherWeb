package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dominio.Magia;

public class DaoMagia {
	String url = "jdbc:mysql://localhost/streetfighter";
	String user = "root";
	String pwd = "root";
	
	public void cadastrar(Magia magia) {
		String query = String.format(""
				+ "INSERT INTO MAGIA"
				+ "(nome, descricao, potencia)"
				+ "VALUES ('%s', '%s', %s);",
				magia.getNome(), magia.getDescricao(),
				magia.getPotencia());
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement comm = conn.prepareStatement(query);
			comm.execute();			
			
		} catch (SQLException e) {
			System.out.println("Falha na persistência dos dados de Magia.");
		}
	}
	
	public int getId() {
		String query = "SELECT MAX(id) FROM MAGIA;";
		int id = 0;
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement comm = conn.prepareStatement(query);
			ResultSet rs = comm.executeQuery();
			
			rs.first();
			
			id = (int)rs.getObject(1);
			
		} catch (SQLException e) {
			System.out.println("Falha na busca dos dados de Magia.");
		}
		
		return id;
	}
}
