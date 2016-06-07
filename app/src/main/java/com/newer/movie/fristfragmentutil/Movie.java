package com.newer.movie.fristfragmentutil;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/6/6.
 */
public class Movie implements Serializable {
    private Integer image;
    private String movieName;
    private String controble;
    private String name;
    private Integer peopleNumber;
    private Integer loveNumber;

    public Movie() {
    }

    public Movie(Integer image, String movieName, String controble,
                 String name, Integer peopleNumber, Integer loveNumber) {
        this.image = image;
        this.movieName = movieName;
        this.controble = controble;
        this.name = name;
        this.peopleNumber = peopleNumber;
        this.loveNumber = loveNumber;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getControble() {
        return controble;
    }

    public void setControble(String controble) {
        this.controble = controble;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public Integer getLoveNumber() {
        return loveNumber;
    }

    public void setLoveNumber(Integer loveNumber) {
        this.loveNumber = loveNumber;
    }
}
