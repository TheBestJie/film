package com.lj.mapper;

import com.lj.model.Play;

import java.util.List;

public interface PlayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Play record);

    Play selectByPrimaryKey(Long id);

    List<Play> selectAll();

    int updateByPrimaryKey(Play record);

    List<Play> getPlaysByFilmId(String filmId);

    Play selectByPlayId(String playId);
}