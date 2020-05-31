package com.example.maciej_madzia.repositories;

import com.example.maciej_madzia.model.Artist;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
    Optional<Artist> getFirstByFirstNameAndLastName(String firstName, String lastName);
}