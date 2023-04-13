package com.example.Journey_of_Taro_V2.dtos.music;

// Individual songs
public class SongDto {
 private Long songId;
 private String songName;
 private String artistName;
 private Boolean isFavorited;

    public SongDto() {
    }

    public SongDto(Long songId, String songName, String artistName, Boolean isFavorited) {
        this.songId = songId;
        this.songName = songName;
        this.artistName = artistName;
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

    public Boolean getFavorited() {
        return isFavorited;
    }

    public void setFavorited(Boolean favorited) {
        isFavorited = favorited;
    }

//    public void setSongDto(SongDto transferToDto) {
//    }
}
