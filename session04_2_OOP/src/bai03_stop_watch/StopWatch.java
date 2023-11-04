package bai03_stop_watch;

public class StopWatch {
    //Trường startTime và endTime là private
    private long startTime, endTime;
    //Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống
    public StopWatch () {
        startTime: System.currentTimeMillis();
    }
    //Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
    public void start() {
        startTime = System.currentTimeMillis();
    }
    //Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    //phương thức getter để trả về giá trị của startTime và endTime.
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    //Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số millisecond giây
    public long getElapsedTime() {
        return endTime - startTime;
    }
    //Viết chương trình đo thời gian thực thi của thuật toán sắp xếp chọn (selection sort) cho 100,000 số.
    public static void selectionSort(int[] numbers) {
        int n = numbers.length;
        //Vòng lặp ngoài để duyệt qua từng phàn từ
        for (int i = 0; i < n - 1; i++) {
            //Vòng lặp trong để so sánh và hoán đổi các phần tử
            for (int j = 0; j < n - 1; j++) {
                //So sánh hai phần từ, nếu phần tử trước lớp hơn phần tử sau thì hoán đổi chúng
                if (numbers[j] > numbers[j + 1]) {
                    //tạo biến temp tạm thời để lưu trữ giá trị của phần tử hiện tại
                    int temp = numbers[j];
                    //Gán giá trị của phần tử sau cho phần tử hiện tại
                    numbers[j] = numbers[j + 1];
                    //Gán giá trị của bién tạm thời cho phần tử sau
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
