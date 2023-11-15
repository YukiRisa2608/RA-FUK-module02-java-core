package bai12_03_stack;

import java.util.Scanner;
import java.util.Stack;
//Bài tập đảo ngược văn bản với stack
//Mục tiêu: luyện tập sử dụng stack
//Đề bài: viết 1 chương trình cho ta nhập số lượng các từ,
// sau đó sẽ cho chúng ta nhập từng từ rồi in ra theo thứ tự đảo ngược của các từ đó theo ví dụ output sau:
//Hướng dẫn:
//B1: tạo 1 stack để lưu trữ văn bản
//B2 tạo 1 biến numberOfWord để lưu số lượng các từ
//B3: tạo 1 vòng lặp for với số lần lặp = số lượng các từ, mỗi vòng lặp cho nhập 1 từ. rồi push vào stack.
//B4: tạo vòng lặp rồi in các từ trong stack ra bằng phương thức remove().
public class StackWord {
    public static void main(String[] args) {
        Stack<String> wordStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of words ");
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Input words " + (i + 1) + ":");
            String word = scanner.nextLine();
            wordStack.push(word);
        }
        System.out.println("Reversed words ");
        while (!wordStack.isEmpty()) {
            //in ra chuoi dao nguoc
            System.out.println(wordStack.pop());
            //chuoi khong bi dao nguoc
//            System.out.println(wordStack.remove(0));
        }
    }
}
