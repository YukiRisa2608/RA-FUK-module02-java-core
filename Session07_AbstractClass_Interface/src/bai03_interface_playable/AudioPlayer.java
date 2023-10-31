package bai03_interface_playable;

public class AudioPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Đang phát Audio …");
    }
}
