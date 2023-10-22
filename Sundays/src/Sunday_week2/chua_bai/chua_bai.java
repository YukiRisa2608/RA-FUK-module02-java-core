package Sunday_week2.chua_bai;

import java.util.Scanner;

public class chua_bai {
    public static void main(String[] args) throws Exception {
        // task1();
        // task2();
        task3();
        // task4();
    }

    private static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập số la mã: ");
        String input = sc.nextLine();
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            int currentValue = getVal(input.charAt(i));
            if(i < input.length() -1 && currentValue < getVal(input.charAt(i+1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        System.out.printf("Số la mã %s sau khi chuyển sang int là: %d ", input, result);
        sc.close();
    }

    private static int getVal(char ch) {
        switch (ch) {
            case 'I':
                return  1;
            case 'V':
                return  5;
            case 'X':
                return  10;
            case 'L':
                return  50;
            case 'C':
                return  100;
            case 'D':
                return  500;
            case 'M':
                return  1000;
            default:
                return 0;
        }
    }



    private static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuổi bất kỳ: ");
        String input = sc.nextLine();
        String hasChecked = "";

        for (int i = 0; i < input.length() - 1; i++) {
            int count = 0;
            if(hasChecked.contains(String.valueOf(input.charAt(i)))) {
                continue;
            }
            for (int j = i; j < input.length(); j++) {
                if(input.charAt(i) == input.charAt(j)) {
                    count++;
                }
            }

            if(count > 1) {
                System.out.printf("Ký tự %c trùng lặp %d lần. ", input.charAt(i), count);
                System.out.println();
            }
            hasChecked += input.charAt(i);
        }
    }

    // tim diem dau -> for i
    // tim diem cuoi -> for2
    // lien tiep, không trung//
    // ki tu hien tai, không trùng với những ký tự phía trươc.
    // chuoi phia truoc check ky tu hien tại
    // trung -> dùng lại -> count.
    // khong trung them vào chuoi phia trược.
    private static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("task3: Nhập vào chuổi bất kỳ: ");
        String input = sc.nextLine();
        String largerSubString = "";

        for (int i = 0; i < input.length(); i++) {
            String subString = "";
            for (int j = i; j < input.length(); j++) {
                if(!checkContaint(subString, input.charAt(j))) {
                    subString += input.charAt(j);
                } else {
                    break;
                }
            }
            if(largerSubString.length() < subString.length()) {
                largerSubString = subString;
            }
        }
        System.out.printf("Chuổi con lớn nhất là: %s", largerSubString);
    }

    private static boolean checkContaint(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c)
                return true;
        }
        return false;
    }
}





