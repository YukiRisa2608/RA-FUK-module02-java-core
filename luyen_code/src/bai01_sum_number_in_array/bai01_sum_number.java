package bai01_sum_number_in_array;
//Bài 1:
//	Nhập vào 1 chuỗi gồm chữ và số, tính tổng các số trong chuỗi
//Ví dụ:
//Input: duong1234
//output: 10
public class bai01_sum_number {
    public static void main(String[] args) {
        String input = "Hello12345";
        int output = sumNumbers(input);
        System.out.println(output);

    }
    public static int sumNumbers(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 0 && input.charAt(i) <= '9') {
                //Bảng mã ASCII, 0 = 48;
                sum += input.charAt(i) - 48;
            }
        }
    return sum;
    }
}
//Hàm isDigit là một phương thức của lớp Character trong Java, (Character.isDigit(kyTu))
// được sử dụng để kiểm tra xem một ký tự có phải là một chữ số (0-9) hay không.
// Phương thức này trả về true nếu ký tự là một chữ số và false nếu không phải.