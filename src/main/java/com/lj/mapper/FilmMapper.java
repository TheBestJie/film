package com.lj.mapper;

import com.lj.model.Film;

import java.util.List;

public interface FilmMapper {

    List<Film> getFilms();

    Film getFilmById(String filmId);
}
