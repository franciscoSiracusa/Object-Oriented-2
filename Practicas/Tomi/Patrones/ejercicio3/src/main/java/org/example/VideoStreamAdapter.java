package org.example;

public class VideoStreamAdapter extends Media {

    private VideoStream videoStream;

    public VideoStreamAdapter() {
        this.videoStream = new VideoStream();
    }

    @Override
    public void play() {
        this.videoStream.reproduce();
    }
}
