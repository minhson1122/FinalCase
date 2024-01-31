package com.example.jwtspring3.service.impl;

import com.example.jwtspring3.model.Song;
import com.example.jwtspring3.repository.SongRepository;
import com.example.jwtspring3.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
