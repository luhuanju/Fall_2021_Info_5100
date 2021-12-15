package finalExam.problem4;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Movie {
    String title;
    GregorianCalendar releaseYear;
    List<String> actors;
    String director;


    public Movie(String title, GregorianCalendar releaseYear, List<String> actors, String director) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.actors = actors;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GregorianCalendar getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(GregorianCalendar releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
