package dominio;

import java.util.ArrayList;

public class Jogador {
	private String nome;
	private int totalPontos;
	private ArrayList<Personagem> personagens;
	
	public Jogador() {
		personagens = new ArrayList<Personagem>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTotalPontos() {
		return totalPontos;
	}

	public void setTotalPontos(int totalPontos) {
		this.totalPontos = totalPontos;
	}
	
	public void addPersonagem(Personagem personagem) {
		if(!personagens.contains(personagem))
			personagens.add(personagem);
		else
			return;
	}
	
	public void removePersonagem(Personagem personagem) {
		if(personagens.contains(personagem))
			personagens.remove(personagem);
		else
			return;
	}
}