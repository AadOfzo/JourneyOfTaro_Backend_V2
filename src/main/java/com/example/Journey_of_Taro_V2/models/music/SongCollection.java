package com.example.Journey_of_Taro_V2.models.music;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

// add Song Collections: Demo, SampleDemo, Single, EP, Album, Playlist in Music collection

@Entity
public class SongCollection {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long songCollectionId;
//    private Boolean isSampleDemo;
//    private Boolean isDemo;
//    private Boolean isSingle;
//    private Boolean isEp;
//    private Boolean isAlbum;
//
//    private String songCollectionName;
//
//    private Boolean songCollectionIsPrivate;
//
//    @OneToMany(mappedBy = "songCollections")
//    @JsonIgnore
//    List<Song> songs;
//
//    @ManyToMany(mappedBy = "songCollections")
//    private Collection<SongCollection> songCollections;
//
//    @ManyToMany
//    @JoinTable(
//            name = "song collections",
//            joinColumns = @JoinColumn(
//                    name = "song_name", referencedColumnName = "song name"),
//            inverseJoinColumns = @JoinColumn(
//                    name = "song_collection_id", referencedColumnName = "song id"))
//    private Collection<Song> songs; // songCollections?
//
//    public Long getSongCollectionId() {
//        return songCollectionId;
//    }
//
//    public void setSongCollectionId(Long songCollectionId) {
//        this.songCollectionId = songCollectionId;
//    }
//
//    public Boolean getSampleDemo() {
//        return isSampleDemo;
//    }
//
//    public void setSampleDemo(Boolean sampleDemo) {
//        isSampleDemo = sampleDemo;
//    }
//
//    public Boolean getDemo() {
//        return isDemo;
//    }
//
//    public void setDemo(Boolean demo) {
//        isDemo = demo;
//    }
//
//    public Boolean getSingle() {
//        return isSingle;
//    }
//
//    public void setSingle(Boolean single) {
//        isSingle = single;
//    }
//
//    public Boolean getEp() {
//        return isEp;
//    }
//
//    public void setEp(Boolean ep) {
//        isEp = ep;
//    }
//
//    public Boolean getAlbum() {
//        return isAlbum;
//    }
//
//    public void setAlbum(Boolean album) {
//        isAlbum = album;
//    }
//
//    public String getSongCollectionName() {
//        return songCollectionName;
//    }
//
//    public void setSongCollectionName(String songCollectionName) {
//        this.songCollectionName = songCollectionName;
//    }
//
//    public Boolean getSongCollectionIsPrivate() {
//        return songCollectionIsPrivate;
//    }
//
//    public void setSongCollectionIsPrivate(Boolean songCollectionIsPrivate) {
//        this.songCollectionIsPrivate = songCollectionIsPrivate;
//    }
}
