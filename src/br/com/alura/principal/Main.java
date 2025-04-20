package br.com.alura.principal;

import br.com.alura.midia.Musica;
import br.com.alura.midia.Podcast;
import br.com.alura.midia.Preferidas;

public class Main {
    public static void main(String[] args) {
        Musica musicaTeste = new Musica();
        musicaTeste.setTitulo("Python");
        musicaTeste.setCantor("GOT7");

        for (int i = 0; i < 3000; i++) {
            musicaTeste.reprosuzir();
            if (i % 2 == 0)
                musicaTeste.curtir();
        }

        System.out.printf("""
                Musica:               %s
                Total de Reproduções: %d
                Total de Curtidas:    %d
                
                """,musicaTeste.getTitulo(), musicaTeste.getTotalReproducoes(), musicaTeste.getTotaCurtidas());

        Podcast podcastTeste = new Podcast();
        podcastTeste.setTitulo("Vrau Cast");
        podcastTeste.setApresentador("Caíto Mainier, Rafael Saraiva");

        for (int i = 0; i < 500; i++) {
            podcastTeste.reprosuzir();
            if (i < 200)
                podcastTeste.curtir();
        }

        System.out.printf("""
                Podcast:              %s
                Total de Reproduções: %d
                Total de Curtidas:    %d
                
                """,podcastTeste.getTitulo(), podcastTeste.getTotalReproducoes(), podcastTeste.getTotaCurtidas());

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(musicaTeste);
        preferidas.inclui(podcastTeste);
    }
}