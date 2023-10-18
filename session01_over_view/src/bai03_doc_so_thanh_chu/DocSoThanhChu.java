package bai03_doc_so_thanh_chu;

import java.util.Scanner;

//Giả sử bạn đang tham gia viết chương trình cho máy đo chiều cao cân nặng, hãy viết một chương trình có khả năng đọc các số nguyên không âm có tối đa 3 chữ số.
//Ví dụ, với số 261, chương trình in ra màn hình two hundred and sixty one.
public class DocSoThanhChu {
    public static void main(String[] args) {
        //Bước 1: viết mã để chương trình hỏi số cần đọc
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương có tối đa 3 chữ số");
        int number = sc.nextInt();
        //Nếu số cần đọc vượt quá khả năng, in ra chuỗi out of ability
        if (number < 0 || number > 999) {
            System.out.println(" out of ability");
        } else {
            String result = "";
            if (number == 0) {
                result = "zero";
        //Bước 2: đọc các số có một chữ số
            } else if (number < 10) {
                result += hangDonVi(number);
        //Bước 3: đọc các số có hai chữ số nhỏ hơn 20
            } else if (number < 20) {
                result += so10Den20(number);
        //Bước 4: đọc các số có hai chữ số lớn hơn hoặc bằng 20
            } else if (number < 100) {
                int tens = number / 10;
                int ones = number % 10;
                result += soHangChuc(tens)+hangDonVi(ones);
        //Bước 5: đọc các số có ba chữ số
            } else {
                int hundreds = number / 100;
                int tens = number/10;
                int soDu = number % 100;
                //Số tròn trăm
                if (soDu == 0) {
                    result += hangDonVi(hundreds)+ " hundred";
                }
                //101--109
                if (soDu < 10) {
                    result += hangDonVi(hundreds)+ " hundred and " + hangDonVi(soDu);
                }
                //110--119
                if (soDu < 20) {
                    result += hangDonVi(hundreds)+ " hundred and " + so10Den20(soDu);
                }
                //120--999
                if (soDu <= 99) {
                    result += hangDonVi(hundreds)+ " hundred and " + soHangChuc(soDu/10) + hangDonVi(soDu%10);
                }
            }

            System.out.println(result);
        }
    }
    public static String hangDonVi (int number) {
        switch (number) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }
    public static String so10Den20 (int number) {
        switch (number) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }public static String soHangChuc (int number) {
        switch (number) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}