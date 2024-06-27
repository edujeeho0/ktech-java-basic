package d4.q2;

public class Music {
    private String title;
    private String artist;
    private String album;
    private int duration;

    public Music(
            String title,
            String artist,
            String album,
            int duration
    ) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }

    public void play() {
        System.out.println(String.format(
                "Now playing, %s...",
                title
        ));
    }

    public void checkDuration() {
        System.out.println(String.format(
                "%s - %d:%d",
                title,
                duration / 60,
                duration % 60
        ));
    }
}
