package br.com.cerch.principal.cenasPri;

import br.com.cerch.principal.cenas.Filmes;
import br.com.cerch.principal.cenas.Serie;

public class PrincipalAbstraido {
	public static void main(String[] args) {
		
		Filmes filme = new Filmes();
		filme.setTitulo("Out");
		
		
		Serie serie = new Serie();
		serie.setTitulo("A r,agedon");
		
		
		for (int i = 0; i < 5000; i++) {
			filme.reproduzir();
		}
		
		for (int i = 0; i < 1000; i++) {
			serie.curtir();
		}
		

		
		
	}

}
