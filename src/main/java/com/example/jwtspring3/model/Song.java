package com.example.jwtspring3.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Singer singer;
    @ManyToOne
    private Album album;
    private String note;
    @Column(length = 1000)
    private String src;
    private Long likes;
    private Long listens;
    private String time;

    public Song(Long id, String name, Singer singer, Album album, String note, String src, Long likes, Long listens) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.album = album;
        this.note = note;
        this.src = src;
        this.likes = likes;
        this.listens = listens;

    }
    public Song() {
        this.time= String.valueOf(LocalDate.now());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public Long getListens() {
        return listens;
    }

    public void setListens(Long listens) {
        this.listens = listens;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
