package dominio;

public class Magia {
	private String nome, descricao;
	private int potencia;
	private Personagem personagem;
	
	public Magia(String nome, String descricao, int potencia) {
		this.nome = nome;
		this.descricao = descricao;
		this.potencia = potencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
}