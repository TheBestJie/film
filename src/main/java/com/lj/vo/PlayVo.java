package com.lj.vo;

import java.math.BigDecimal;
import java.util.Date;

public class PlayVo {

    private String playId;

    private String filmId;

    private String filmName;

    private Date playTime;

    private String playTimeStr;

    private String lanType;

    private String roomId;

    private String roomName;

    private BigDecimal price;

    public String getPlayId() {
        return playId;
    }

    public void setPlayId(String playId) {
        this.playId = playId;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public String getLanType() {
        return lanType;
    }

    public void setLanType(String lanType) {
        this.lanType = lanType;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPlayTimeStr() {
        return playTimeStr;
    }

    public void setPlayTimeStr(String playTimeStr) {
        this.playTimeStr = playTimeStr;
    }
}
