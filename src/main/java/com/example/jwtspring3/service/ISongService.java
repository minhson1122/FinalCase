package com.example.jwtspring3.service;

import com.example.jwtspring3.model.Song;

import java.util.List;

public interface ISongService extends IGeneralService<Song>{

    Object findAll(String name, String albumName, String singerName);
}
