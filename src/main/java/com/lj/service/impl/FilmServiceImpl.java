package com.lj.service.impl;

import com.lj.mapper.FilmMapper;
import com.lj.model.Film;
import com.lj.service.FilmService;
import com.lj.vo.FilmDetailVo;
import com.lj.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public List<FilmVo> selectAll() {
        List<Film> filmList = filmMapper.getFilms();
//        System.out.println(filmList.toString());
        List<FilmVo> filmVoList = new ArrayList<>(filmList.size());

        for (Film film : filmList) {
            FilmVo vo = new FilmVo();
            vo.setFilmId(film.getFilm_id());
            vo.setName(film.getFilm_name());
            vo.setImgPath(film.getImg_path());
            vo.setDirector(film.getDirector());

            filmVoList.add(vo);
        }

        return filmVoList;
    }


    @Override
    public FilmDetailVo selectById(String filmId) {
        Film film = filmMapper.getFilmById(filmId);
        FilmDetailVo detailVo = new FilmDetailVo();
        detailVo.setFilmId(filmId);
        detailVo.setDirector(film.getDirector());
        detailVo.setPlayer(film.getPlayer());
        detailVo.setImgPath(film.getImg_path());
        detailVo.setType(film.getType());
        detailVo.setSynopsis(film.getSynopsis());
        detailVo.setCountry(film.getCountry());
        detailVo.setLength(film.getLength());
        return detailVo;
    }
}
