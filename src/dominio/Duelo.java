package dominio;

import java.util.ArrayList;

public class Duelo {
	private int numero, vencedor;
	private ArrayList<Personagem> personagens;
	private Pontuacao pontuacao;
	
	public Duelo() {
		personagens = new ArrayList<Personagem>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getVencedor() {
		return vencedor;
	}

	public void setVencedor(int vencedor) {
		this.vencedor = vencedor;
	}
	
	public void setPersonagem(Personagem personagem) {
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
	
	public void setPontuacao(Pontuacao pontuacao) {
		this.pontuacao = pontuacao;
	}
}