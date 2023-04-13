package com.example.Journey_of_Taro_V2.models.music;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Song {
    @Id
    @GeneratedValue
    Long songId;

    private String songName;
    private String artistName;
    private Boolean isFavorited;

    public Song() {}

    public Song(Long id, String songName, String artistName, Boolean isFavorited) {
        this.songId = id;
        this.songName = songName;
        this.artistName = artistName;
        this.isFavorited = isFavorited;
    }

    public Long getId() {
        return songId;
    }

    public void setId(Long id) {
        this.songId = id;
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

    @ManyToOne(optional = false)
    private SongCollection songCollections;

    public SongCollection getSongCollections() {
        return songCollections;
    }

    public void setSongCollections(SongCollection songCollections) {
        this.songCollections = songCollections;
    }
}
