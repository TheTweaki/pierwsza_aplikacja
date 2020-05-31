package com.example.maciej_madzia.repositories;

import com.example.maciej_madzia.model.Artist;
import com.example.maciej_madzia.model.Song;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Long> {

    List<Song> getAllByArtistsIsContaining(Artist artist);
}