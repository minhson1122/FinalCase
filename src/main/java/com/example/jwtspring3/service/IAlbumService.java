package com.example.jwtspring3.service;

import com.example.jwtspring3.model.Album;

import java.util.List;

public interface IAlbumService extends IGeneralService<Album>{
    List<Album> findByName(String name);
    List<Album> findAlbumByOrderByLikesDesc();
    List<Album> findAlbumByOrderByListensDesc();
    List<Album> findTop5ByOrderByLikesDesc();
    List<Album> findTop5ByOrderByListensDesc();
}
