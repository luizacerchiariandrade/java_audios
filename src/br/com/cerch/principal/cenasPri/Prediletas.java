package br.com.cerch.principal.cenasPri;

import br.com.cerch.principal.cenas.Modelo;
import br.com.cerchi.musicas.Audio;

public class Prediletas {
	

	
//	o fluxo é, a classe principal instancia e gera curtidas, apos isso cada classe avalia com seu polimorfismo do getClassificacao gerado na mae e apos isso esta classe aqui retorna um texto de acordo com a regra de negocios
	
	public void inclui(Modelo modelo) {
		if(modelo.getClassificacao() > 8) {
			System.out.println(modelo.getTitulo() + " Predileto");
		} else
		{
			System.out.println(modelo.getTitulo() +" uma excelente opcao");
		}
		
	}

}
