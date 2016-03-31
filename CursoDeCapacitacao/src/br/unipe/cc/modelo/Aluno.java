package br.unipe.cc.modelo;

public class Aluno<T> extends Pessoa implements Comparable<T> {
	private double media;

	public Aluno(int matricula, String nome, double media) {
		super(matricula, nome);
		this.media = media;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "Aluno [media=" + media + "]";
	}

	public int compareTo(Aluno aluno){
		if	(this.matricula < aluno.matricula) return -1;
		if	(this.matricula > aluno.matricula)	return	1;
		return	0;
	}

}
