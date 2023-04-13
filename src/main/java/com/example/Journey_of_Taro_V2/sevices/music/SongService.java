package com.example.Journey_of_Taro_V2.sevices.music;

import com.example.Journey_of_Taro_V2.dtos.music.SongDto;
import com.example.Journey_of_Taro_V2.dtos.music.SongInputDto;
import com.example.Journey_of_Taro_V2.exceptions.RecordNotFoundException;
import com.example.Journey_of_Taro_V2.models.music.Song;
import com.example.Journey_of_Taro_V2.repositories.music.MusicRepository;
import com.example.Journey_of_Taro_V2.repositories.music.SongRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongService {
    private static SongRepository songRepository;
    private SongService songService;
    private final MusicRepository musicRepository;

    public SongService(SongRepository songRepository,SongService songService, MusicRepository musicRepository) {
        this.songRepository = songRepository;
        this.songService = songService;
        this.musicRepository = musicRepository;

    }

    public List<SongDto> getAllSongs() {
        List<Song> songList = songRepository.findAll();
        return transferSongListToDtoList(songList);
    }

    public List<SongDto> getAllSongsBySongName(String songName) {
        List<Song> songList = songRepository.findAllSongsByNameEqualsIgnoreCase(songName);
        return transferSongListToDtoList(songList);
    }

    public List<SongDto> transferSongListToDtoList(List<Song> songs){
        List<SongDto> songDtoList = new ArrayList<>();

        for(Song song : songs) {
            SongDto dto = transferToDto(song);

            songDtoList.add(dto);
        }
        return songDtoList;
    }

//    public SongDto getAllSongsBySongName(String songName) {
//
//        if (songRepository.findBySongName(songName).isPresent()){
//            Song song = songRepository.findAllSongsBySongName(songName).get();
//            SongDto dto =transferToDto(song);
//            if(song.getSongName() != null){
//                dto.setSongDto(songService.transferToDto(song.getSongName()));
//            }
//            if(song.getSongName() != null){
//                dto.setSongCollectionDto(musicService.transferToDto(song.getSongName()));
//            }
//
//            return transferToDto(song);
//        } else {
//            throw new RecordNotFoundException("No Songs Found");
//        }
//    }

    public SongDto addSong(SongInputDto dto) {

        Song song = transferToSong(dto);
        songRepository.save(song);

        return transferToDto(song);
    }

    public void deleteSong(String songName) {

        songRepository.deleteBySongName(songName);

    }

    public static SongDto updateSong(String songName, SongInputDto inputDto) {

        if (! songRepository.findBySongName(songName).isEmpty()){

            List<Song> song = songRepository.findById(songName);

            Song song1 = transferToSong(inputDto);
            song1.setSongName(song());

            songRepository.save(song1);

            return transferToDto(song1);

        } else {

            throw new  RecordNotFoundException("No Songs Found");

        }

    }
    public static Song transferToSong(SongInputDto dto) {
        var song = new Song();

        song.setSongName(dto.getSongName());
        song.setArtistName(dto.getArtistName());
        song.setFavorited(dto.getIsFavorited());

        return song;
    }
    public SongDto transferToDto(Song song){
        SongDto dto = new SongDto();

        dto.setSongId(song.getId());
        dto.setSongName(song.getSongName());
        dto.setArtistName(song.getArtistName());
        dto.setFavorited(song.getFavorited());

        if (song.getSongCollection() != null){
            dto.setSongCollectionDto(SongService.transferToDto(song.getSongCollection()));
        }

        return dto;
    }

    public List<SongDto> getSongBySongName(String s) {
    }
}
