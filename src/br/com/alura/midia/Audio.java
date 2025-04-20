package br.com.alura.midia;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totaCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotaCurtidas() {
        return totaCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir() {
        totaCurtidas += 1;
    }

    public void reprosuzir() {
        System.out.println("Tocando: " + titulo);
    }
}
