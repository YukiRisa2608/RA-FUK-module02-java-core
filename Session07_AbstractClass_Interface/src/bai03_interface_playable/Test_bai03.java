package bai03_interface_playable;

public class Test_bai03 {
    public static void main(String[] args) {
        Playable audio = new AudioPlayer();
        Playable video = new VideoPlayer();
        audio.play();
        video.play();
    }
}
