package Sunday_week2.bai01_chuyen_so_la_ma_sang_so_int;
//Bài 1: Chuyển so La Mã sang int
//Các chữ số La Mã được thể hiện bằng bảy ký hiệu khác nhau  : I, V, X, L, C và D.M
//Symbol       Value
//I              1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//
//Ví dụ,  2 được viết dưới II dạng số La Mã, chỉ cần hai số cộng lại với nhau. 12 được viết là  XII, mà đơn giản là X + II. Số 27 được viết là XXVII, tức là XX + V + II.
//
//Hãy viết chương trình nhập vào 1 số La Mã và chuyển nó thành 1 số nguyên.
//
//Ví du:
//XIX = X + (-I) + X= 19
//IX = -I + X = 9
//Input: string = "III"   Output: 3
//Input: string = "LVIII"   Output: 58
//Input: string = "MCMXCIV"  Output: 1994. Vì M = 1000, CM = 900, XC = 90 and IV = 4
public class bai01_ChuyenSoLaMaSangInt {
    public static void main(String[] args) {
        String input = "IX";
        int output = chuyenSoLaMaSangInt(input);
        System.out.println(output);
    }
    public  static int chuyenSoLaMaSangInt (String s) {
        int result = 0;
        int prevNum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            String currentString = String.valueOf(s.charAt(i));
            int currentNum = getSoLaMa(currentString);
            if (currentNum >= prevNum) {
                result += currentNum;
            } else {
                result -= currentNum;
            }
            prevNum = currentNum;
        }
        return result;
    }

    public static int getSoLaMa (String string) {
        switch (string) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                return 0; // ko hop le
        }
    }
}
