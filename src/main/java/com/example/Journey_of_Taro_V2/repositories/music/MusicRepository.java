package com.example.Journey_of_Taro_V2.repositories.music;

import com.example.Journey_of_Taro_V2.models.music.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicRepository extends JpaRepository {
    List<Song> findAllBySongNameEqualsIgnoreCase(String songName);
    List<Song> findAllByArtistNameEqualsIgnoreCase(String artistName);
    List<Song> findSongsByIsFavoritedEqualsIgnoreCase(String isFavorited);
}
