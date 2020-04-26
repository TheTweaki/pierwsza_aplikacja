package com.example.maciej_madzia_apk.repositories;

import com.example.maciej_madzia_apk.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
