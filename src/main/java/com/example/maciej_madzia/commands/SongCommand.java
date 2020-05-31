package com.example.maciej_madzia.commands;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Created by pk on 2019-06-03
 */

@Getter
@Setter
@NoArgsConstructor
public class SongCommand {
    private Long id;
    private String title;
    private String genre;
    private String ismn;
    private String year;
    private String publisher;
    private Long artistId;
}