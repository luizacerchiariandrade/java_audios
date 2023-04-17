package br.com.cerchi.musicas;

public class MinhasPreferidas {
	
	public void inclui(Audio audio) {
		if(audio.getClassificacao() > 8) {
			System.out.println(audio.getTitulo() + " Predileto");
		} else
		{
			System.out.println(audio.getTitulo() +" uma excelente opcao");
		}
		
	}

}
