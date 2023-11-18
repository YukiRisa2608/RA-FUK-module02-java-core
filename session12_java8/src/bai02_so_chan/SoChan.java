package bai02_so_chan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Bài tập 2: Lọc số chẵn trong danh sách số nguyên:
//Đề bài: Dùng phương thức filter() để tìm số chẵn
//Hướng dẫn làm bài:
//Bước 1: Tạo một danh sách số nguyên.
//Bước 2: Sử dụng Stream API và phương thức filter() để lọc ra các số chẵn từ danh sách.
public class SoChan {
    public static void main(String[] args) {
        //Array
        int[] arr = {99, 52, 53, 54, 55, 56, 57, 58, 59, 60};
        //Arrays.stream() để chuyển đổi mảng thành một luồng (Stream)
        //toArray() được sử dụng để chuyển đổi kết quả của luồng (Stream) các số chẵn thành một mảng.
        int[] soChan = Arrays.stream(arr).filter(i -> i % 2 == 0).toArray();
        System.out.println("So chan arrays: " + Arrays.toString(soChan));

        //List
        List<Integer> numbers = Arrays.asList(99, 52, 53, 54, 55, 56, 57, 58, 59, 60);
        List<Integer> soChanlist = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("So Chan list: " + soChanlist);
    }
}
