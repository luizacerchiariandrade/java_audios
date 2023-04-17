package br.com.cerch.principal.cenas;

public class Modelo {
	
	private String titulo;
	private double duracao;
	private int totaReproducoes;
	private int totalCurtidas;
	private int classificacao;
	
	public int getClassificacao() {
		return classificacao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getDuracao() {
		return duracao;
	}
	public int getTotalCurtidas() {
		return totalCurtidas;
	}
	public int getTotaReproducoes() {
		return totaReproducoes;
	}
	public void curtir() {
		this.totalCurtidas++;
	}
	
	public void reproduzir() {
		this.totaReproducoes++;
	}

}
