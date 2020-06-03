package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;import org.apache.coyote.http2.ConnectionException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dominio.Golpe;

public class DaoGolpe {
	String url = "jdbc:mysql://localhost/streetfighter";
	String user = "root";
	String pwd = "root";
	
	public void cadastrar(Golpe golpe) {
		String query = String.format(""
				+ "INSERT INTO GOLPE "
				+ "(chuteFraco, chuteForte, socoFraco, socoForte)"
				+ "VALUES (%s, %s, %s, %s);",
				golpe.getChuteFraco(), golpe.getChuteForte(),
				golpe.getSocoFraco(), golpe.getSocoForte());
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement comm = conn.prepareStatement(query);
			comm.execute();			
			
		} catch (SQLException e) {
			System.out.println("Falha na persistência dos dados de Golpe.");
		}
	}
	
	public int getId() {
		String query = String.format("SELECT MAX(id) FROM GOLPE;");
		int id = 0;
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement comm = conn.prepareStatement(query);
			ResultSet rs = comm.executeQuery();
			
			rs.first();
			
			id = (int)rs.getObject(1);
			
		} catch (SQLException e) {
			System.out.println("Falha na busca dos dados de Golpe.");
		}
		
		return id;
	}
}
