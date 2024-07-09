package d10.prac.q1;

import java.time.LocalDate;

public class Music {
    private String title;
    private String album;
    private String artist;
    private LocalDate release;

    public Music() {
    }

    public Music(String title, String album, String artist, LocalDate release) {
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.release = release;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + title + '\'' +
                ", album='" + album + '\'' +
                ", artist='" + artist + '\'' +
                ", release=" + release +
                '}';
    }
}
