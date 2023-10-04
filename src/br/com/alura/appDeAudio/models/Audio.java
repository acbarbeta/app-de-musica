package br.com.alura.appDeAudio.models;

public class Audio {
    private String title;
    private int totalPlayCount;
    private int totalLikes;
    private int rating;


    public void like() {
        this.totalLikes++;
    }

    public void play() {
        this.totalPlayCount++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPlayCount() {
        return totalPlayCount;
    }

    public int getLikes() {
        return totalLikes;
    }

    public int getRating() {
        return rating;
    }
}
