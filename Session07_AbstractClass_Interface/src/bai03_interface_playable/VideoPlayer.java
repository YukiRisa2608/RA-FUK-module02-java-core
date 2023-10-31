package bai03_interface_playable;
//2 lớp con là AudioPlayer và VideoPlayer kế thừa interface Playable và triển khai phương thức play()
// để in ra dòng “Đang phát Audio …” hoặc “Đang phát Video …” tương ứng
public class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Đang phát Video …");
    }
}
