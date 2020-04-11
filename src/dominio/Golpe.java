package dominio;

public class Golpe {
	private int chuteFraco, chuteForte, socoFraco, socoForte;
	private Personagem personagem;
	
	public Golpe(int chuteFraco, int chuteForte, int socoFraco, int socoForte) {
		this.chuteFraco = chuteFraco;
		this.chuteForte = chuteForte;
		this.socoFraco = socoFraco;
		this.socoForte = socoForte;
	}

	public int getChuteFraco() {
		return chuteFraco;
	}

	public void setChuteFraco(int chuteFraco) {
		this.chuteFraco = chuteFraco;
	}

	public int getChuteForte() {
		return chuteForte;
	}

	public void setChuteForte(int chuteForte) {
		this.chuteForte = chuteForte;
	}

	public int getSocoFraco() {
		return socoFraco;
	}

	public void setSocoFraco(int socoFraco) {
		this.socoFraco = socoFraco;
	}

	public int getSocoForte() {
		return socoForte;
	}

	public void setSocoForte(int socoForte) {
		this.socoForte = socoForte;
	}
	
	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
}