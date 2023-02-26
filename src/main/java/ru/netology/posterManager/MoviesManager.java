package ru.netology.posterManager;

public class MoviesManager {
    private int limit = 10;
    private int currentNumberFilms = limit;
    private FilmConstructor[] movies = new FilmConstructor[0];

    public MoviesManager(int limit) {

        this.limit = limit;
    }

    public MoviesManager() {
    }


    public void addFilm(FilmConstructor movie) {
        FilmConstructor[] temp = new FilmConstructor[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            temp[i] = movies[i];
        }
        temp[temp.length - 1] = movie;
        movies = temp;
    }

    public FilmConstructor[] findAll() {

        return movies;
    }

    public FilmConstructor[] findlast() {
        int resultlength;
        if (movies.length < limit) {
            resultlength = movies.length;
        } else {
            resultlength = limit;
        }
        FilmConstructor[] temp = new FilmConstructor[resultlength];  
        for (int i = 0; i < temp.length; i++) {
            temp[i] = movies[movies.length - 1 - i];
        }
        return temp;
    }
}