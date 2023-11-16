package bai04_football_team_cach1_comparable;

import java.util.List;

public class Sorting {
    // khai báo lớp BubbleSort.
    //class BubbleSort<T extends Comparable<T>>: Định nghĩa tên của lớp và khai báo kiểu generic T.
    //T extends Comparable<T>: Cụ thể cho lớp T, nó phải là một kiểu dữ liệu mà có thể so sánh được (Comparable), nên cần kết thùa lại lớp Compareable
    public static class BubbleSort<T extends Comparable<T>> implements ISortAlgorithm<T> {
        //Nguyên lý hoạt động của thuật toán sắp xếp nổi bọt (Bubble Sort) là
        // liên tục so sánh và hoán đổi các cặp phần tử liên tiếp cho đến khi danh sách được sắp xếp
        //Khi thuật toán hoàn thành, các phần tử lớn nhất sẽ "nổi" lên đến cuối danh sách,
        // và sau mỗi lượt duyệt, phần tử lớn nhất sẽ được đặt ở vị trí cuối cùng.
        @Override
        public void sort(List<T> list) {
            //list.get(j).compareTo(list.get(j + 1)) > 0 là để kiểm tra xem phần tử ở vị trí j có lớn hơn phần tử ở vị trí j + 1 không.
            // Nếu điều kiện này là true, nghĩa là phần tử ở vị trí j lớn hơn phần tử ở vị trí j + 1,
            // thực hiện việc hoán đổi vị trí của chúng để đưa phần tử lớn hơn về phía sau.
            int n = list.size();
            //Khởi tạo biến check với giá trị là true.
            // Biến này sẽ được sử dụng để kiểm tra xem có sự thay đổi (hoán đổi) nào xảy ra trong một lượt duyệt hay không.
            boolean check = true;
            // Điều kiện i < n - 1 && check đảm bảo rằng vòng lặp sẽ tiếp tục cho đến khi i đạt đến n - 1 hoặc biến check trở thành false.
            for (int i = 1; i < n - 1 && check; i++) {
                check = false;
                for (int j = 0; j < n - 1; j++) {
                    if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                        T temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                        //Nếu điều kiện này là true, có nghĩa là phần tử ở vị trí j lớn hơn phần tử ở vị trí j + 1.
                        // Tiến hành hoán đổi chúng và đặt check thành true để báo hiệu rằng có sự thay đổi xảy ra trong lượt duyệt này.
                        //Nếu có bất kỳ sự thay đổi nào trong lượt duyệt này, check sẽ được đặt thành true.
                        // Ngược lại, nếu không có sự thay đổi nào, giá trị của check vẫn giữ là false.
                        check = true;
                    }
                }
            }
        }
    }
        public static class SelectionSort<T extends Comparable <T>> implements ISortAlgorithm<T> {
        //chia làm 2 danh sách, đã sắp xếp ở bên trái, chưa sắp xếp ở bên phải
       //chọn phần tử nhỏ nhất trong phạm vi chưa được sắp xếp và đặt nó vào đầu phạm vi đã sắp xếp.
        //sau mỗi lượt duyệt, phần tử nhỏ nhất sẽ ở đầu mảng
            @Override
            public void sort(List<T> list) {
                int n = list.size();
                for (int i = 0; i < n - 1; i++) {
                    int minIndex = i; // Giả sử phần tử hiện tại là nhỏ nhất
                    for (int j = i + 1; j < n; j++) {
                        // Nếu phần tử tại vị trí j nhỏ hơn phần tử tại vị trí minIndex
                        if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                            minIndex = j; // Cập nhật minIndex thành j
                        }
                    }
                    //Kiểm tra xem giá trị của minIndex có thay đổi không để tránh hoán đổi không cần thiết.
                    if (minIndex != i) {
                        //Dời phần tử nhỏ nhất mà ta giả sử ban đầu vào biến tạm thời temp, để lấy chỗ cho phần tử nhỏ nhất có thể vào.
                        T temp = list.get(minIndex);
                        //Gán phần tử tại vị trí i (nhỏ nhất mà ta tìm thấy trong danh sách chưa sắp xếp)
                        // vào đúng vị trí của phần tử nhỏ nhất trong danh sách đã sắp xếp (vị trí giả sử ban đầu đã dời ra).
                        list.set(minIndex, list.get(i));
                        //Gán giá trị của biến ban đầu đã gán cho biến tạm thời temp vào vị trí i trong danh sách chua sắp xếp
                        list.set(i, temp);
                    }
                }
            }
        }
        public static class InsertSort<T extends Comparable<T>> implements ISortAlgorithm<T> {
        //Phần tử đầu tiên được coi là đã được sắp xếp.
        //So sánh phần tử tiếp theo với các phần tử trong phạm vi đã được sắp xếp.
        //Nếu phần tử này nhỏ hơn một phần tử trong phạm vi đã sắp xếp, di chuyển phần tử đó về phía sau và tiếp tục so sánh và di chuyển.
        //Sau mỗi lần duyệt, một phần tử mới được "chèn" vào phạm vi đã sắp xếp và đặt ở đúng vị trí.
            @Override
            public void sort(List<T> list) {
                int n = list.size();
                for (int i = 1; i < n; ++i) {
                    //Lấy phần tử tại vị trí i và lưu trữ nó vào biến key.
                    // Phần tử này sẽ được so sánh và chèn vào đúng vị trí trong phạm vi đã sắp xếp.
                    T key = list.get(i);
                    //Khởi tạo biến j để đánh dấu phần tử liền trước phần tử key trong phạm vi đã sắp xếp.
                    int j = i - 1;
                    // Bắt đầu vòng lặp để di chuyển các phần tử lớn hơn key về phía sau.
                    while (j >= 0 && list.get(j).compareTo(key) < 0) {
                        // Chèn phần tử key vào vị trí đúng trong phạm vi đã sắp xếp.
                        //Khi thuật toán di chuyển qua danh sách để tìm vị trí đúng cho key, j được giảm xuống cho đến khi tìm ra vị trí đúng.
                        // Khi tìm thấy vị trí đúng, chèn key vào vị trí sau cùng (right) của phạm vi đã sắp xếp.
                        list.set(j + 1, key);
                    }
                }
            }
        }
}
