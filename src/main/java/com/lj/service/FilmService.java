package com.lj.service;

import com.lj.vo.FilmDetailVo;
import com.lj.vo.FilmVo;

import java.util.List;

public interface FilmService {

    List<FilmVo> selectAll();

    FilmDetailVo selectById(String filmId);

}
