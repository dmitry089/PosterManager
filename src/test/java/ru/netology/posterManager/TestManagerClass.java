package ru.netology.posterManager;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestManagerClass {
    FilmConstructor movies1 = new FilmConstructor(1, "Film1");
    FilmConstructor movies2 = new FilmConstructor(2, "Film2");
    FilmConstructor movies3 = new FilmConstructor(3, "Film3");
    FilmConstructor movies4 = new FilmConstructor(4, "Film4");
    FilmConstructor movies5 = new FilmConstructor(5, "Film5");
    FilmConstructor movies6 = new FilmConstructor(6, "Film6");
    FilmConstructor movies7 = new FilmConstructor(7, "Film7");
    FilmConstructor movies8 = new FilmConstructor(8, "Film8");
    FilmConstructor movies9 = new FilmConstructor(9, "Film9");
    FilmConstructor movies10 = new FilmConstructor(10, "Film10");
    FilmConstructor movies11 = new FilmConstructor(11, "Film11");

    @Test
    public void shouldAddFilmOne() {
        MoviesManager manager = new MoviesManager(1);
        manager.addFilm(movies1);

        FilmConstructor[] expected = {movies1};
        FilmConstructor[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilmNoneLimit() {
        MoviesManager manager = new MoviesManager(0);
        FilmConstructor[] expected = {};
        FilmConstructor[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilmLast() {
        MoviesManager manager = new MoviesManager(3);
        manager.addFilm(movies8);
        manager.addFilm(movies9);
        manager.addFilm(movies10);

        FilmConstructor[] expected = {movies10, movies9,movies8};
        FilmConstructor[] actual = manager.findlast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAllMovies() {
        MoviesManager manager = new MoviesManager(11);
        manager.addFilm(movies1);
        manager.addFilm(movies2);
        manager.addFilm(movies3);
        manager.addFilm(movies4);
        manager.addFilm(movies5);
        manager.addFilm(movies6);
        manager.addFilm(movies7);
        manager.addFilm(movies8);
        manager.addFilm(movies9);
        manager.addFilm(movies10);
        manager.addFilm(movies11);

        FilmConstructor[] expected = {movies1,movies2,movies3,movies4,movies5,movies6,movies7,movies8,movies9,movies10,movies11};
        FilmConstructor[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
        @Test
    public void shouldAddFilmLimit(){
        MoviesManager manager = new MoviesManager(5);
        manager.addFilm(movies1);
        manager.addFilm(movies2);
        manager.addFilm(movies3);
        manager.addFilm(movies4);
        manager.addFilm(movies5);

        FilmConstructor[] expected = {movies1, movies2, movies3, movies4, movies5};
        FilmConstructor[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddFilmLastLimit() {
        MoviesManager manager = new MoviesManager(10);
        manager.addFilm(movies1);
        manager.addFilm(movies2);
        manager.addFilm(movies3);
        manager.addFilm(movies4);
        manager.addFilm(movies5);
        manager.addFilm(movies6);
        manager.addFilm(movies7);
        manager.addFilm(movies8);
        manager.addFilm(movies9);
        manager.addFilm(movies10);

        FilmConstructor[] expected = {movies10, movies9,movies8,movies7,movies6,movies5,movies4,movies3,movies2,movies1};
        FilmConstructor[] actual = manager.findlast();

        Assertions.assertArrayEquals(expected, actual);
    }

}