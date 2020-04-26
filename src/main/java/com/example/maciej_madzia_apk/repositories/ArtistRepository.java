package com.example.maciej_madzia_apk.repositories;

import com.example.maciej_madzia_apk.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
