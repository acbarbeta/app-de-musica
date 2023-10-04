package br.com.alura.appDeAudio.models;

public class StarredTracks {
    public void add(Audio audio) {
        if (audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " é um sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTitle() + " também é um dos que todo mundo está curtindo!");
        }
    }
}
