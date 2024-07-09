package d10.prac.q3;

import java.time.LocalDate;
import java.util.List;

public class Movie {
    private String title;
    private LocalDate release;
    private String director;
    private List<String> genres;

    public Movie() {
    }

    public Movie(String title, LocalDate release, String director, List<String> genres) {
        this.title = title;
        this.release = release;
        this.director = director;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", release=" + release +
                ", director='" + director + '\'' +
                ", genres=" + genres +
                '}';
    }
}
