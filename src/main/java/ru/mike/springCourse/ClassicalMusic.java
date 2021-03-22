package ru.mike.springCourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Night on Bald Mountain");
        songs.add("Symphony no. 5 in C Minor, op. 67");
    }
    @Override
    public List<String> getSong() {
        return songs;
    }
}
