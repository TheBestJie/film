package com.lj.service;

import com.lj.vo.PlayDetailVo;
import com.lj.vo.PlayVo;

import java.util.List;

public interface PlayService {

    List<PlayVo> getPlaysByFilmId(String filmId);

    PlayDetailVo getDetailById(String playId);
}
