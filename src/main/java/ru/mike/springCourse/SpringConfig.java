package ru.mike.springCourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
@ComponentScan("ru.mike.springCourse")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }


    @Bean
    public List<Music> musicGenre() {
        return Arrays.asList(classicalMusic(), rapMusic(), rockMusic());
    }

    @Bean
    MusicPlayer musicPlayer() {
        return new MusicPlayer(musicGenre());
    }
}
