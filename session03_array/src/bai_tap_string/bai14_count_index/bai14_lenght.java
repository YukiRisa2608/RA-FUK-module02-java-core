package bai_tap_string.bai14_count_index;
//Đề bài: Viết một phương thức Java để đếm số lượng từ trong chuỗi có độ dài lớn hơn hoặc bằng một giá trị cho trước.
//Hướng dẫn: Dùng phương thức length() để lấy được độ dài của chuỗi.
public class bai14_lenght {
    public static void main(String[] args) {
        String inputString = "đếm số lượng từ trong chuỗi có độ dài lớn hơn hoặc bằng một giá trị cho trước";
        int lenght = 5;
        int equal = countString(inputString, lenght);

        System.out.println("Số từ trong chuỗi có độ dài lớn hơn hoặc bằng " + lenght + " là : " + equal + " từ");
    }

    public static int countString(String inputString, int length) {
        String[] words = inputString.split("\\s+"); //tách chuỗi thành mảng các từ, bởi khảng trắng
        int count = 0;

        for (String word : words) {
            if (word.length() >= length) {
                count++;
            }
        }
        return count;
    }
}

