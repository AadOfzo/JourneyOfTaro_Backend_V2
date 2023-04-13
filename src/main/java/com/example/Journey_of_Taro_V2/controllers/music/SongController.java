package com.example.Journey_of_Taro_V2.controllers.music;

import com.example.Journey_of_Taro_V2.dtos.music.SongDto;
import com.example.Journey_of_Taro_V2.dtos.music.SongInputDto;
import com.example.Journey_of_Taro_V2.sevices.music.MusicService;
import com.example.Journey_of_Taro_V2.sevices.music.SongCollectionService;
import com.example.Journey_of_Taro_V2.sevices.music.SongService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class SongController {
    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    //    private final SongCollectionService songCollectionService;
//    private final MusicService musicService;
//
//    public SongController(SongService songService, SongCollectionService songCollectionService, ) {
//        this.songService = songService;
//        this.songCollectionService = songCollectionService;
//        this.musicService = musicService;
//    }

    @GetMapping("/songs")
    public ResponseEntity<List<SongDto>> getAllSongs(@RequestParam(value = "songName", required = false)Optional<String> songName) {

        List<SongDto> dtos;

        if (songName.isEmpty()){
            dtos = songService.getAllSongs();
        } else {
            dtos = songService.getAllSongsBySongName(songName.get());
        }

        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/songs/{songName}")
    public ResponseEntity<SongDto> getSong(@PathVariable("songName")String songName) {

        SongDto song = songService.getSongBySongName(songName);

        return ResponseEntity.ok().body(song);
    }

    @PostMapping("/songs")
    public ResponseEntity<Object> addSong(@Valid @RequestBody SongInputDto songInputDto) {

        SongDto dto = songService.addSong(songInputDto);

        return ResponseEntity.created(null).body(dto);
    }

    @DeleteMapping("/songs/{songName}")
    public ResponseEntity<Object> deleteSong(@PathVariable String songName) {

        songService.deleteSong(songName);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/songs/{songName}")
    public ResponseEntity<Object> updateSong(@PathVariable String songName, @Valid @RequestBody SongInputDto newSong) {

        SongDto dto = SongService.updateSong(songName, newSong);

        return ResponseEntity.ok().body(dto);
    }
}
