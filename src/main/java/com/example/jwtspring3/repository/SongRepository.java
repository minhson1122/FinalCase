package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song,Long> {
}
