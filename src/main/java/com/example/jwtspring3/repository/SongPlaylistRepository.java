package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.SongPlayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongPlaylistRepository extends JpaRepository<SongPlayList, Long> {
}
