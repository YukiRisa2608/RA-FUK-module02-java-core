package bai08_anyMatch;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//Bài tập 8: Sử dụng phương thức anyMatch()
//Đề bài: Kiểm tra xem một danh sách có chứa số chẵn hay không
//Hướng dẫn làm bài:
//Bước 1: Tạo một danh sách số nguyên.
//Bước 2: Sử dụng Stream API và phương thức anyMatch() để kiểm tra xem danh sách có chứa ít nhất một số chẵn hay không.
public class AnyMatch {
    public static void main(String[] args) {
        List<Integer> randomList = new Random().ints(10, 1, 100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Random list: " + randomList);

        boolean soChan = randomList.stream()
                .anyMatch(i -> i % 2 == 0);
        if (soChan) {
            System.out.println("Co so chan");
        } else {
            System.out.println("khong co so chan");
        }
    }
}
