package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Media audio = new Audio();
        Media videoFile = new VideoFile();
        Media videoStream = new VideoStreamAdapter();

        List<Media> medias = new ArrayList<>(List.of(audio, videoFile, videoStream));

        MediaPlayer mediaPlayer = new MediaPlayer(medias);

        mediaPlayer.play();
    }
}