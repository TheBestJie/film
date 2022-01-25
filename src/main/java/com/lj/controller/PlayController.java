package com.lj.controller;

import com.lj.service.PlayService;
import com.lj.vo.PlayDetailVo;
import com.lj.vo.PlayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PlayController {

    @Autowired
    private PlayService playService;

    @RequestMapping("/play")
    public String getPlays(@RequestParam String filmId, Model model) {
        List<PlayVo> playVos = playService.getPlaysByFilmId(filmId);
        model.addAttribute("playVos", playVos);
        return "play";
    }

    @RequestMapping("/seat")
    public String getSeats(@RequestParam String playId, Model model) {
        PlayDetailVo detailVo = playService.getDetailById(playId);
        model.addAttribute("detailVo", detailVo);
        return "seat";
    }

}
