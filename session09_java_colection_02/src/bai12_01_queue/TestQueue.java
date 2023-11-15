package bai12_01_queue;

import java.util.LinkedList;
import java.util.Queue;
// Viết chương trình sử dụng queue để lưu trữ và in ra các phần tử của một danh sách đầu vào.
public class TestQueue {
    public static void main(String[] args) {
        String[] input = {"Rikkei", "Academy", "De", "Nong", "Dan", "Biet", "Code"};

        Queue<String> queueList = new LinkedList<>();

        for (String word : input) {
            queueList.add(word);
        }

        // In ra các phần tử của queue và loại bỏ chúng từ queue
        System.out.println("Các phần tử của danh sách đầu vào:");
        while (!queueList.isEmpty()) {
            String word = queueList.poll(); // Lấy và loại bỏ phần tử đầu tiên của queueList, cho vao word
            System.out.println(word);
        }
    }
}

