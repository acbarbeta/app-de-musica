package br.com.alura.appDeAudio.main;

import br.com.alura.appDeAudio.models.Podcast;
import br.com.alura.appDeAudio.models.Song;
import br.com.alura.appDeAudio.models.StarredTracks;

public class Main {
    public static void main(String[] args) {
        Song mySong = new Song();

        mySong.setTitle("In the End");
        mySong.setArtist("Linkin Park");

        for (int i = 0; i < 1000; i++) {
            mySong.play();
        }

        for (int i = 0; i < 50; i++) {
            mySong.like();
        }


        Podcast myPodcast = new Podcast();

        myPodcast.setTitle("Um Podcast sobre Nada");
        myPodcast.setHost("Fulano de tal");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        StarredTracks myStarredTracks = new StarredTracks();
        myStarredTracks.add(myPodcast);
        myStarredTracks.add(mySong);
    }


}