package br.com.alura.midia;

public class Preferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() > 8)
            System.out.println(audio.getTitulo() + ": Todo mundo ama!");
        if (audio.getClassificacao() <= 8)
            System.out.println(audio.getTitulo() + ": Muitos gostam ");
    }
}
