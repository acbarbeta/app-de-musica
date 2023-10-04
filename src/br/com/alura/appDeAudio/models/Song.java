package br.com.alura.appDeAudio.models;

public class Song extends Audio {
    private String album;
    private String artist;
    private String gender;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getRating() {
        if (this.getTotalPlayCount() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
