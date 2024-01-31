package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song,Long> {
    List<Song> findAllByNameContaining(String name);
    List<Song> findAllByAlbum_NameContaining(String albumName);
    List<Song> findAllBySinger_NameContaining(String singerName);
    List<Song> findAllByNameContainingAndAlbum_NameContaining(String name, String albumName);
    List<Song> findAllByNameContainingAndSinger_NameContaining(String name, String singerName);
    List<Song> findAllByAlbum_NameContainingAndSinger_NameContaining(String albumName, String singerName);
    List<Song> findAllByNameContainingAndAlbum_NameContainingAndSinger_NameContaining(String name,String albumName, String singerName);

}
