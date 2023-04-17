package br.com.cerch.principal;

import br.com.cerchi.musicas.Audio;
import br.com.cerchi.musicas.MinhasPreferidas;
import br.com.cerchi.musicas.Musica;
import br.com.cerchi.musicas.PodCast;



public class Principal {
	
public static void main(String[] args) {
	Musica minhaMusica = new Musica();
	minhaMusica.setTitulo("Forever");
    minhaMusica.setCantor("Kiss");

	
	for (int i = 0; i < 1000; i++) {
		minhaMusica.reproduzir();
	}
	
	for (int i = 0; i < 50; i++) {
		minhaMusica.curtir();
	}
	
	PodCast meuPodcast = new PodCast();
	meuPodcast.setTitulo("BolhaDev");
	meuPodcast.setApresentador("MarcosMendes");

	
	for (int i = 0; i < 5000; i++) {
		meuPodcast.reproduzir();
	}
	
	for (int i = 0; i < 1000; i++) {
		meuPodcast.curtir();
	}
	
	MinhasPreferidas preferidas = new MinhasPreferidas();
	preferidas.inclui(meuPodcast);
	preferidas.inclui(minhaMusica);
}
}




