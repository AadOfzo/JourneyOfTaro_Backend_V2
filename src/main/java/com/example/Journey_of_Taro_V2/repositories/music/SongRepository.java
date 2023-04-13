package com.example.Journey_of_Taro_V2.repositories.music;

import com.example.Journey_of_Taro_V2.models.music.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, String> {

    List<Object> findAllSongsBySongName(String songName);

    List<Song> findBySongName(String songName);
    void deleteBySongName(String songName);

    List<Song> findAllSongsByNameEqualsIgnoreCase(String songName);
}
