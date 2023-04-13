package com.example.Journey_of_Taro_V2.dtos.music;

public class SongCollectionDto {
    private Long songCollectionId;
    private Boolean isSampleDemo;
    private Boolean isDemo;
    private Boolean isSingle;
    private Boolean isEp;
    private Boolean isAlbum;

    private String songCollectionName;

    private Boolean songCollectionIsPrivate;

    public SongCollectionDto(Long songCollectionId, Boolean isSampleDemo, Boolean isDemo, Boolean isSingle, Boolean isEp, Boolean isAlbum, String songCollectionName, Boolean songCollectionIsPrivate) {
        this.songCollectionId = songCollectionId;
        this.isSampleDemo = isSampleDemo;
        this.isDemo = isDemo;
        this.isSingle = isSingle;
        this.isEp = isEp;
        this.isAlbum = isAlbum;
        this.songCollectionName = songCollectionName;
        this.songCollectionIsPrivate = songCollectionIsPrivate;
    }

    public Long getSongCollectionId() {
        return songCollectionId;
    }

    public void setSongCollectionId(Long songCollectionId) {
        this.songCollectionId = songCollectionId;
    }

    public Boolean getSampleDemo() {
        return isSampleDemo;
    }

    public void setSampleDemo(Boolean sampleDemo) {
        isSampleDemo = sampleDemo;
    }

    public Boolean getDemo() {
        return isDemo;
    }

    public void setDemo(Boolean demo) {
        isDemo = demo;
    }

    public Boolean getSingle() {
        return isSingle;
    }

    public void setSingle(Boolean single) {
        isSingle = single;
    }

    public Boolean getEp() {
        return isEp;
    }

    public void setEp(Boolean ep) {
        isEp = ep;
    }

    public Boolean getAlbum() {
        return isAlbum;
    }

    public void setAlbum(Boolean album) {
        isAlbum = album;
    }

    public String getSongCollectionName() {
        return songCollectionName;
    }

    public void setSongCollectionName(String songCollectionName) {
        this.songCollectionName = songCollectionName;
    }

    public Boolean getSongCollectionIsPrivate() {
        return songCollectionIsPrivate;
    }

    public void setSongCollectionIsPrivate(Boolean songCollectionIsPrivate) {
        this.songCollectionIsPrivate = songCollectionIsPrivate;
    }
}
