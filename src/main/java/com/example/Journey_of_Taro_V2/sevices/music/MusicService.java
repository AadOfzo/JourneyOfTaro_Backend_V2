package com.example.Journey_of_Taro_V2.sevices.music;

import com.example.Journey_of_Taro_V2.dtos.music.SongDto;
import com.example.Journey_of_Taro_V2.models.music.Song;
import com.example.Journey_of_Taro_V2.repositories.music.MusicRepository;
import com.example.Journey_of_Taro_V2.repositories.music.SongRepository;

import java.util.ArrayList;
import java.util.List;

public class MusicService {
//    private final SongRepository songRepository;
//    private final MusicRepository musicRepository;
//    private final SongService songService;
//
//    public MusicService(SongRepository songRepository, MusicRepository musicRepository, SongService songService) {
//        this.songRepository = songRepository;
//        this.musicRepository = musicRepository;
//        this.songService = songService;
//    }
//
//    public List<SongDto> getAllSongs() {
//        List<Song> songList = songRepository.findAll();
//        return transferSongListToDtoList(songList);
//    }
//
//    public List<SongDto> getAllSongsByIsFavorited(String isFavorited) {
//        List<Song> songList = songRepository.findAllSongsByIsFavoritedEqualsIgnoreCase();
//        return transferSongListToDtoList(songList);
//    }
//
//    public List<SongDto> transferSongListToDtoList(List<Song> songs){
//        List<SongDto> songDtoList = new ArrayList<>();
//
//        for (Song song: songs) {
//            SongDto dto = transferToDto(song);
//
//        }
//    }
}
