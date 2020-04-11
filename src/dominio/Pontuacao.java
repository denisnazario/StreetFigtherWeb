package dominio;

import java.util.ArrayList;

public class Pontuacao {
	private int pontosJogador, pontosMaquina;
	private ArrayList<Duelo> duelos;
	
	public Pontuacao() {
		duelos = new ArrayList<Duelo>();
	}

	public int getPontosJogador() {
		return pontosJogador;
	}

	public void setPontosJogador(int pontosJogador) {
		this.pontosJogador = pontosJogador;
	}

	public int getPontosMaquina() {
		return pontosMaquina;
	}	

	public void setPontosMaquina(int pontosMaquina) {
		this.pontosMaquina = pontosMaquina;
	}
	
	public void addDuelo(Duelo duelo) {
		if(!duelos.contains(duelo)) {
			duelos.add(duelo);
			duelo.setPontuacao(this);
		} else
			return;
	}
	
	public void removeDuelo(Duelo duelo) {
		if(duelos.contains(duelo)) {
			duelos.remove(duelo);
			duelo.setPontuacao(this);
		} else
			return;
	}
}