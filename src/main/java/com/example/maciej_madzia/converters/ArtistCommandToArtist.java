package com.example.maciej_madzia.converters;

import com.example.maciej_madzia.commands.ArtistCommand;
import com.example.maciej_madzia.commands.SongCommand;
import com.example.maciej_madzia.model.Artist;

import com.example.maciej_madzia.model.Song;
import com.example.maciej_madzia.repositories.ArtistRepository;

import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by pk on 2019-06-03
 */
@Component
public class ArtistCommandToArtist implements Converter<ArtistCommand, Artist> {

    @Synchronized
    @Nullable
    @Override
    public Artist convert(ArtistCommand source) {
        if (source == null) {
            return null;
        }

        final Artist artist = new Artist();
        artist.setFirstName(source.getFirstName());
        artist.setLastName(source.getLastName());
        artist.setNick(source.getNick());

        return artist;
    }
}