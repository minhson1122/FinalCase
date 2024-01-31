package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.PlayList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<PlayList,Long> {
}
