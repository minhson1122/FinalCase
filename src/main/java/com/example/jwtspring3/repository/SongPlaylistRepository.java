package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.SongPlayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongPlaylistRepository extends JpaRepository<SongPlayList, Long> {
    List<SongPlayList>findAllByPlayListId(Long id);
}
