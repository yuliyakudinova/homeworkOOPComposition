package ru.netology.composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    void addNewFilm() {
        PosterManager posman = new PosterManager();
        Films one = new Films("First", 1);
        Films two = new Films("Second", 2);
        Films three = new Films("Third", 3);
        Films four = new Films("Fourth", 4);

        posman.addNewFilm(one);
        posman.addNewFilm(two);
        posman.addNewFilm(three);
        posman.addNewFilm(four);

        Films[] expected = {one, two, three, four};
        Films[] actual = posman.showAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void showAll() {
        PosterManager posman = new PosterManager();
        Films[] expected = {};
        Films[] actual = posman.showAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLimit() {
        PosterManager posman = new PosterManager();
        Films one = new Films("First", 1);
        Films two = new Films("Second", 2);
        Films three = new Films("Third", 3);
        Films four = new Films("Fourth", 4);
        Films five = new Films("Fifth", 5);
        Films six = new Films("Sixth", 6);
        Films seven = new Films("Seventh", 7);
        Films eight = new Films("Eighth", 8);
        Films nine = new Films("Ninth", 9);
        Films ten = new Films("Tenth", 10);
        Films eleven = new Films("Eleventh", 11);
        Films twelve = new Films("Twelth", 12);

        posman.addNewFilm(one);
        posman.addNewFilm(two);
        posman.addNewFilm(three);
        posman.addNewFilm(four);
        posman.addNewFilm(five);
        posman.addNewFilm(six);
        posman.addNewFilm(seven);
        posman.addNewFilm(eight);
        posman.addNewFilm(nine);
        posman.addNewFilm(ten);
        posman.addNewFilm(eleven);
        posman.addNewFilm(twelve);

        posman.getLimit();

        Films[] expected = {twelve, eleven, ten, nine, eight, seven, six, five, four, three};
        Films[] actual = posman.getLimit();
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLimit2() {
        PosterManager posman = new PosterManager();
        Films one = new Films("First", 1);
        Films two = new Films("Second", 2);
        Films three = new Films("Third", 3);
        Films four = new Films("Fourth", 4);
        Films five = new Films("Fifth", 5);

        posman.addNewFilm(one);
        posman.addNewFilm(two);
        posman.addNewFilm(three);
        posman.addNewFilm(four);
        posman.addNewFilm(five);

        posman.getLimit();

        Films[] expected = {five, four, three, two, one};
        Films[] actual = posman.getLimit();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shoulChekLimitFilms() {
        PosterManager posman = new PosterManager(5);
        assertEquals(5, posman.getLimitFilms());
    }

    @Test
    void shoulChekLimitFilms2() {
        PosterManager posman1 = new PosterManager();
        assertEquals(10, posman1.getLimitFilms());

    }
}