package com.nabenik.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Movie")
public class Movie implements Serializable {

    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movieId;

    @Column
    private String title;

    @Column
    private String year1;

    @Column
    private String duration;

    public Movie(){

    }

    public Movie(String title, String year, String duration) {
        this.title = title;
        this.year1 = year;
        this.duration = duration;
    }

    @OneToMany(
            mappedBy = "movie",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Actor> actorList;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year1;
    }

    public void setYear(String year) {
        this.year1 = year;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }
}
