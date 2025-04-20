package br.com.alura.principal;

import br.com.alura.midia.Musica;
import br.com.alura.midia.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musicaTeste = new Musica();
        musicaTeste.setTitulo("Python");
        musicaTeste.setCantor("GOT7");

        for (int i = 0; i < 1000; i++) {
            musicaTeste.reprosuzir();
            if (i % 2 == 0)
                musicaTeste.curtir();
        }

        System.out.printf("""
                Total de Reproduções: %d
                Total de Curtidas:    %d
                """, musicaTeste.getTotalReproducoes(),musicaTeste.getTotaCurtidas());

        Podcast podcastTeste = new Podcast();
        podcastTeste.setTitulo("Vrau Cast");
        podcastTeste.setApresentador("Caíto Mainier, Rafael Saraiva");

        for (int i = 0; i < 500; i++) {
            podcastTeste.reprosuzir();
            if (i < 200)
                podcastTeste.curtir();
        }

        System.out.printf("""
                Total de Reproduções: %d
                Total de Curtidas:    %d
                """, podcastTeste.getTotalReproducoes(),podcastTeste.getTotaCurtidas());
    }
}