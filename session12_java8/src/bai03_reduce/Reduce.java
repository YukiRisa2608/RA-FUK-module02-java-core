package bai03_reduce;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//Bước 1: Tạo một danh sách số nguyên.
//Bước 2: Sử dụng Stream API và phương thức reduce() để tính tổng của các số trong danh sách.
public class Reduce {
    public static void main(String[] args) {
        //danh sách (List) gồm 10 số nguyên ngẫu nhiên trong khoảng từ 1 (bao gồm) đến 100 (không bao gồm).
        //ints() của lớp Random tạo ra một luồng số nguyên ngẫu nhiên co các tham số được truyền vào
        List<Integer> randomList = new Random().ints(10, 1, 100)
                //Phương thức boxed() để chuyển đổi luồng các số nguyên thành một luồng các đối tượng Integer
                // (Chuyển đổi IntStream thành Stream<Integer>)
                .boxed()
                //Thu thập các phần tử của luồng thành một danh sách.
                .collect(Collectors.toList());
        System.out.println("Random numbers");
        System.out.println(randomList);

//Bước 2: Sử dụng Stream API và phương thức reduce() để tính tổng của các số trong danh sách.
        //0 là giá trị khởi tạo của tổng. Nếu danh sách rỗng, giá trị trả về 0.
        //Integer::sum là hàm thực hiện phép cộng hai số nguyên.
        int sum = randomList.stream().reduce(0, Integer::sum);
        System.out.println("Sum = " + sum);

    }
}
