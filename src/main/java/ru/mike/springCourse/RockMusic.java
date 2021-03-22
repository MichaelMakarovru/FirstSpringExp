package ru.mike.springCourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{

    private List<String> songs = new ArrayList<>();
    {
        songs.add("Wind cries Mary");
        songs.add("Smells like a teen spirit");
        songs.add("Thunder storm");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
