package ru.netology.composition;

import lombok.Data;

@Data
public class PosterManager {
    private int limitFilms = 10;

    private Films[] items = new Films[0];

    public void addNewFilm(Films item) {

        int lenght = items.length + 1;

        Films[] tmp = new Films[lenght];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = item;
        items = tmp;
    }

    public Films[] showAll() {
        return items;
    }

    public PosterManager() {
    }

    public PosterManager(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public Films[] getLimit() {
        Films[] items = showAll();
        int resultLength = 0;
        if (items.length < limitFilms) {
            resultLength = items.length;
        } else {
            resultLength = limitFilms;
        }
        Films[] result = new Films[items.length];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}

