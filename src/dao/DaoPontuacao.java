package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dominio.Pontuacao;

public class DaoPontuacao {
	String url = "jdbc:mysql://localhost/streetfighter";
	String user = "root";
	String pwd = "root";
	
	public void cadastrar(Pontuacao pontuacao, int duelo) {
		String query = String.format(""
				+ "INSERT INTO PONTUACAO"
				+ "(pontosJogador, pontosMaquina, duelo) VALUES"
				+ "(%s, %s, %s);", pontuacao.getPontosJogador(),
				pontuacao.getPontosMaquina(), duelo);
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement comm = conn.prepareStatement(query);
			comm.execute();			
			
		} catch (SQLException e) {
			System.out.println("Falha na persistência dos dados de Pontuacao.");
		}
	}
}
