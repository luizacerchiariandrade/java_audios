package br.com.cerchi.musicas;

public class Audio {
	
	private String titulo;
	private double duracao;
	private int totaReproducoes;
	private int totalCurtidas;
	private int classificacao;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getDuracao() {
		return duracao;
	}

	public int getTotaReproducoes() {
		return totaReproducoes;
	}

	public int getTotalCurtidas() {
		return totalCurtidas;
	}

	public int getClassificacao() {
		return classificacao;
	}

	
	public void curtir() {
		this.totalCurtidas++;
	}
	
	public void reproduzir() {
		this.totaReproducoes++;
	}
	
}
