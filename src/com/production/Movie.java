package com.production;

public abstract class Movie {
    private String movieTitle;
    private String producer;
    private Enum Genre;

    public Movie() {  }

    public Movie(String movieTitle, String producer, Enum genre) {
        this.movieTitle = movieTitle;
        this.producer = producer;
        Genre = genre;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Enum getGenre() {
        return Genre;
    }

    public void setGenre(Enum genre) {
        Genre = genre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Название" + "\tРежиссер" + "\tЖанр" + "\tДополнительные сведения\n");
        sb.append(this.getMovieTitle() + "\t" + this.getProducer() + "\t");
        return sb.toString();
    }

    public abstract double movieCosts();

}
