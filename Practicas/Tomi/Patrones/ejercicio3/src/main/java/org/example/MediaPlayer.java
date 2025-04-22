package org.example;

import java.util.List;

public class MediaPlayer {
    private List<Media> medias;

    public MediaPlayer(List<Media> medias) {
        this.medias = medias;
    }

    public void play() {
        medias.stream().forEach(media -> media.play());
    }
}
