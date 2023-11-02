package bai03_stop_watch;

import java.util.Random;

import static bai03_stop_watch.StopWatch.selectionSort;

public class main_stop_watch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] numbers = new int[100000];
        // Khởi tạo mảng với số ngẫu nhiên từ 100000 số
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }
        //Bấm bắt đầu
        stopWatch.start();
        //Thưc thi thuật toán sắp xếp với mảng đã khai báo trên
        selectionSort(numbers);
        //Bấm kết thúc
        stopWatch.stop();
        //Tính thời gian đã thực hiện
        System.out.println("Thời gian thực thi đoạn code trên là: " + stopWatch.getElapsedTime() + " millis");
    }
}
