package ru.mike.springCourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music{

    private List<String> songs = new ArrayList<>();
    {
        songs.add("Wno gon stop me");
        songs.add("Gangsta paradise");
        songs.add("Rap game");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
