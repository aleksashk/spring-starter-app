package ru.philimonov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("musicBean", ClassicalMusic.class);
        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();
        context.close();
    }
}