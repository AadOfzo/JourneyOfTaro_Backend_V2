package com.example.Journey_of_Taro_V2.dtos.music;

import javax.validation.constraints.NotNull;

// Individual songs
public class SongInputDto {
 private Long songId;
 private String songName;
 private String artistName;
 @NotNull(message = "Song must be in collection")
 private String inSongCollection;
 private Boolean isFavorited;

    public SongInputDto() {
    }

    public SongInputDto(Long songId, String songName, String artistName, String inSongCollection, Boolean isFavorited) {
        this.songId = songId;
        this.songName = songName;
        this.artistName = artistName;
        this.inSongCollection = inSongCollection;
        this.isFavorited = isFavorited;
    }

    public Long getSongId() {
        return songId;
    }

    public void setSongId(Long songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getInSongCollection() {
        return inSongCollection;
    }

    public void setInSongCollection(String inSongCollection) {
        this.inSongCollection = inSongCollection;
    }

    public Boolean getFavorited() {
        return isFavorited;
    }

    public void setFavorited(Boolean favorited) {
        isFavorited = favorited;
    }
}
