package com.lj.service.impl;

import com.lj.mapper.FilmMapper;
import com.lj.mapper.PlayMapper;
import com.lj.mapper.RoomMapper;
import com.lj.model.Film;
import com.lj.model.Play;
import com.lj.model.Room;
import com.lj.service.PlayService;
import com.lj.vo.PlayDetailVo;
import com.lj.vo.PlayVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayServiceImpl implements PlayService {

    @Autowired
    private PlayMapper playMapper;

    @Autowired
    private FilmMapper filmMapper;

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public List<PlayVo> getPlaysByFilmId(String filmId) {
        List<Play> plays = playMapper.getPlaysByFilmId(filmId);
        Film film = filmMapper.getFilmById(filmId);

        List<PlayVo> playVos = new ArrayList<>();
        for (Play play : plays) {
            PlayVo vo = new PlayVo();
            vo.setFilmName(film.getFilm_name());
            BeanUtils.copyProperties(play, vo);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            vo.setPlayTimeStr(format.format(vo.getPlayTime()));
            playVos.add(vo);

        }
        return playVos;
    }


    @Override
    public PlayDetailVo getDetailById(String playId) {
        Play play = playMapper.selectByPlayId(playId);
        PlayDetailVo detailVo = new PlayDetailVo();
        BeanUtils.copyProperties(play, detailVo);

        Film film = filmMapper.getFilmById(play.getFilmId());
        detailVo.setFilmName(film.getFilm_name());
        detailVo.setImgPath(film.getImg_path());

        Room room = roomMapper.selectById(play.getRoomId());
        detailVo.setSeatInfo(room.getSeatInfo());

        return detailVo;
    }
}
