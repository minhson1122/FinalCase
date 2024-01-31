package com.example.jwtspring3.service.impl;

import com.example.jwtspring3.model.Song;
import com.example.jwtspring3.repository.SongRepository;
import com.example.jwtspring3.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService implements ISongService {
    @Autowired
    SongRepository songRepository;

    @Override
    public Iterable<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song save(Song song) {
        return songRepository.save(song);
    }

    @Override
    public Optional<Song> findById(Long id) {
        return songRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        songRepository.deleteById(id);
    }
    public List<Song> findAll(String name, String albumName, String singerName) {
        if (name != null && singerName != null && albumName != null) {
            return songRepository.findAllByNameContainingAndAlbum_NameContainingAndSinger_NameContaining(name,albumName,singerName);
        } else if (name != null && singerName != null) {
            return songRepository.findAllByNameContainingAndSinger_NameContaining(name,singerName);
        } else if (name != null && albumName != null) {
            return songRepository.findAllByNameContainingAndAlbum_NameContaining(name,albumName);
        } else if (singerName != null && albumName != null) {
            return songRepository.findAllByAlbum_NameContainingAndSinger_NameContaining(albumName,singerName);
        } else if (name != null) {
            return songRepository.findAllByNameContaining(name);
        } else if (singerName != null) {
            return songRepository.findAllBySinger_NameContaining(singerName);
        } else if (albumName != null) {
            return songRepository.findAllByAlbum_NameContaining(albumName);
        } else {
            return songRepository.findAll();
        }
    }
}
