package dominio;

import java.util.ArrayList;

public class Personagem {
	private String nome, pais;
	private char sexo;
	private ArrayList<Jogador> jogadores;
	private ArrayList<Duelo> duelos;
	private Golpe golpe;
	private Magia magia;
	
	public Personagem(String nome, String pais, char sexo) {
		this.nome = nome;
		this.pais = pais;
		this.sexo = sexo;
		jogadores = new ArrayList<Jogador>();
		duelos = new ArrayList<Duelo>();
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void addJogador(Jogador jogador) {
		if(!jogadores.contains(jogador))
			jogadores.add(jogador);
		else
			return;
	}
	
	public void removeJogador(Jogador jogador) {
		if(jogadores.contains(jogador))
			jogadores.remove(jogador);
		else
			return;
	}
	
	public void addDuelo(Duelo duelo) {
		if(!duelos.contains(duelo))
			duelos.add(duelo);
		else
			return;
	}
	
	public void removeDuelo(Duelo duelo) {
		if(duelos.contains(duelo))
			duelos.remove(duelos);
		else
			return;
	}
	
	public void setGolpe(Golpe golpe) {
		this.golpe = golpe;
	}
	
	public void setMagia(Magia magia) {
		this.magia = magia;
	}
}