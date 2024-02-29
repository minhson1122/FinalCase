package com.example.jwtspring3.controller;

import com.example.jwtspring3.model.Song;
import com.example.jwtspring3.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/songs")
public class SongController {
    @Autowired
    ISongService songService;
    @GetMapping
    public ResponseEntity findAll(String name, String albumName, String singerName){
        return new ResponseEntity<>(songService.findAll(name,albumName,singerName), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity findAllByAuthorId(@PathVariable Long id){
        return new ResponseEntity<>(songService.findAllByAuthorId(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity save(@RequestBody Song song){
        return new ResponseEntity<>(songService.save(song), HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity save(@RequestBody Song song, @PathVariable Long id){
        song.setId(id);
        return new ResponseEntity<>(songService.save(song), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
    songService.remove(id);
    return new ResponseEntity<>("delete done", HttpStatus.OK);
    }
    @GetMapping("like/{id}")
    public ResponseEntity setLike(@PathVariable Long id){
        return new ResponseEntity<>(songService.setLike(id),HttpStatus.OK);
    }
    @GetMapping("listen/{id}")
    public ResponseEntity setListen(@PathVariable Long id){
        return new ResponseEntity<>(songService.setListen(id),HttpStatus.OK);
    }
    @GetMapping("top")
    public ResponseEntity topSong(){
        return new ResponseEntity<>(songService.findTop10ByListens(),HttpStatus.OK);
    }
}
