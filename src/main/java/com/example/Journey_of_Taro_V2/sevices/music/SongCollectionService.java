package com.example.Journey_of_Taro_V2.sevices.music;

import com.example.Journey_of_Taro_V2.dtos.music.SongCollectionDto;
import com.example.Journey_of_Taro_V2.exceptions.RecordNotFoundException;
import com.example.Journey_of_Taro_V2.models.music.SongCollection;
import com.example.Journey_of_Taro_V2.repositories.music.SongCollectionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Deze klasse bevat de service methodes van de CIModuleController

@Service
public class SongCollectionService {

//
//    private final SongCollectionRepository songCollectionRepository;
//    private SongCollection songCollection;
//
//    public SongCollectionService(SongCollectionRepository songCollectionRepository) {
//        this.songCollectionRepository = songCollectionRepository;
//    }
//
//    public List<SongCollectionDto> getAllSongCollections() {
//        List<SongCollection> ciModules = SongCollectionRepository.findAll();
//        List<SongCollectionDto> dtos = new ArrayList<>();
//        for (SongCollection ci : ciModules) {
//            dtos.add(transferToDto(ci));
//        }
//        return dtos;
//    }
//
//    public SongCollectionDto getSongCollection(String songName) {
//        Optional<SongCollection> songCollection = SongCollectionRepository.findBySongName(songName);
//        if(songCollection.isPresent()) {
//            SongCollectionDto sc = transferToDto(songCollection.get());
//            return sc;
//        } else {
//            throw new RecordNotFoundException("No song collection found");
//        }
//    }
//
//    public SongCollectionDto addSongCollection(SongCollectionDto songCollectionDto) {
//        SongCollectionRepository.save(transferToSongCollection(songCollection));
//        return SongCollectionDto;
//    }
//
//    public void deleteSongCollection(String songName) {
//        SongCollectionRepository.deleteById(songName);
//    }
//
//    public void updateSongCollection(String songName, SongCollectionDto songCollectionDto) {
//        if(!songCollection.existsBySongName(songName)) {
//            throw new RecordNotFoundException("No ci-module found");
//        }
//        SongCollection storedSongCollection = songCollection.findBySongName(songName).orElse(null);
//        songCollection.setId(songCollectionDto.getId());
//        songCollection.setType(songCollectionDto.getType());
//        songCollection.setName(songCollectionDto.getName());
//        songCollection.setPrice(songCollectionDto.getPrice());
//        songCollection.save(songCollection);
//    }
//
//    public SongCollection transferToSongCollection(SongCollectionDto dto){
//        SongCollection songCollection = new SongCollection();
//
//        songCollection.setId(dto.getId());
//        songCollection.setName(dto.getName());
//        songCollection.setType(dto.getType());
//        songCollection.setPrice(dto.getPrice());
//
//        return songCollection;
//    }
//
//    public static SongCollectionDto transferToDto(SongCollection songCollection){
//        var dto = new SongCollectionDto();
//
//        dto.id = songCollection.getId();
//        dto.name = songCollection.getName();
//        dto.type = songCollection.getType();
//        dto.price = songCollection.getPrice();
//
//        return dto;
//    }
}
