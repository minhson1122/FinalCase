package com.example.jwtspring3.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Singer singer;
    @ManyToOne
    private User author;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public void setListens(Long listens) {
        this.listens = listens;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
