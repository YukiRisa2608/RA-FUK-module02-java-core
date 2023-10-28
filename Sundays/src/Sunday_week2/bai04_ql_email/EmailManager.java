package Sunday_week2.bai04_ql_email;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Bài 4: Quản lý danh sách email
//Hãy viết một ứng dụng Java cho phép người dùng quản lý danh sách email.
// Ứng dụng này sẽ cho phép người dùng thực hiện các chức năng sau:
//- Thêm email vào danh sách: Người dùng nhập một địa chỉ email và ấn "1. Thêm" để thêm vào danh sách.
//- Xem danh sách email: Người dùng ấn "2. Xem danh sách" để hiển thị danh sách các email đã được thêm.
//- Xóa email khỏi danh sách: Người dùng nhập một địa chỉ email và ấn "3. Xóa" để loại bỏ email đó khỏi danh sách.
//- Kiểm tra email hợp lệ: Ứng dụng sẽ kiểm tra xem một địa chỉ email được nhập có hợp lệ hay không (sử dụng regex để kiểm tra định dạng email).
//- Sắp xếp danh sách email: Ứng dụng cho phép người dùng sắp xếp danh sách email theo thứ tự tăng dần hoặc giảm dần.
//- Đếm số lượng email hợp lệ trong danh sách.
//- Đếm số lượng email không hợp lệ trong danh sách.
//Yêu cầu bổ sung:
//Sử dụng mảng (array) để lưu trữ danh sách các địa chỉ email.
//Sử dụng các phương thức của lớp String để thực hiện các thao tác trên chuỗi.
//Sử dụng regex để kiểm tra định dạng email hợp lệ (bạn có thể bỏ qua bước này nếu chưa có kiến thức về regex).
//Hãy tạo menu để người dùng chọn các chức năng trên.
//Nếu người dùng nhập sai hoặc danh sách rỗng, bạn có thể hiển thị thông báo lỗi và cho người dùng nhập lại
public class EmailManager {
    //Khai báo biến global cho phép các phương thức bên dưới có thể sử dụng chung
    private static String[] emailList;
    private static int countEmail = 0;
    private static Scanner scanner = new Scanner(System.in);

    //tạo mảng với size do người dùng nhập vào
    public static void main(String[] args) {
        System.out.println("Input size of email list");
        int size = scanner.nextInt();
        scanner.nextLine();
        emailList = new String[size];
        testMenu(emailList);
    }
//Truyền emailist vào testMenu cho phép tất cả các phương thức ở đâu được sử dụng mảng này để thêm, sửa, xóa...
    private static void testMenu(String[] emailList) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
        System.out.println("___MENU___");
        System.out.println("1. Add email");
        System.out.println("2. Show emails list");
        System.out.println("3. Delete email");
        System.out.println("4. Check valid email");
        System.out.println("5. Sort email");
        System.out.println("6. Count valid email");
        System.out.println("7. Count invalid email");
        System.out.println("8. Exit");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                addEmail(emailList);
                break;
            case 2:
                showEmail(emailList);
                break;
            case 3:
                deleteEmail(emailList);
                break;
            case 4:
                checkValidEmail();
                break;
            case 5:
                sortEmail(emailList);
                break;
            case 6:
                countValidEmail(emailList);
                break;
            case 7:
                countInvalidEmail(emailList);
                break;
            case 8:
                System.out.println("Exiting");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid, please try again!");
        }
        } while (choice != 8);
    }

    //- Thêm email vào danh sách:
    private static void addEmail(String[] emailList) {
        System.out.println("Enter a email address to add.");
        String addEmail = scanner.nextLine();
        if (countEmail < emailList.length) {
            emailList[countEmail] = addEmail;
            countEmail++;
            System.out.println("Email added!");
        } else {
            System.out.println("Email list is full, cannot add.");
        }
    }
    //- Xem danh sách email:
    private static void showEmail(String[] emailList) {
        for (String email : emailList) {
            if (email != null) {
            System.out.println(email);
            } else {
                System.out.println("Email list is empty!");
            }
        }
    }
    //- Xóa email khỏi danh sách:
    private static void deleteEmail(String[] emailList) {
        System.out.println("Input email to delete:");
        String deleteEmail = scanner.nextLine();
        boolean findDeleteEmail = false;
        for (int i = 0; i < emailList.length; i++) {
            if (emailList[i].equals(deleteEmail)) {
                emailList[i] = null;
                countEmail--;
                System.out.println("Email deleted!");
                findDeleteEmail = true;
                break;
            } else {
                System.out.println("Not found!");
            }
        }
    }
//- Kiểm tra email hợp lệ: Ứng dụng sẽ kiểm tra xem một địa chỉ email được nhập có hợp lệ hay không
    private static void checkValidEmail() {
        System.out.println("Enter an email to validate: ");
        String emailCheck = scanner.nextLine();

        if (validateEmail(emailCheck)) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is not valid");
        }
    }
//-sử dụng regex để kiểm tra định dạng email.
    private static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    //- Sắp xếp danh sách email:
    private static void sortEmail(String[] emailList) {
        if (countEmail != 0) {
            //sắp xếo từ vị trí 0 đến vị trí cuối cùng trong mảng
            Arrays.sort(emailList, 0, countEmail);
            System.out.println("Email list after sorted");
            showEmail(emailList);
        } else {
            System.out.println("Email list is empty");
        }
    }
    //- Đếm số lượng email hợp lệ trong danh sách.
    private static void countValidEmail(String[] emailList) {
        int countValidEmail = 0;
        for (int i = 0; i < countEmail; i++) {
            if (validateEmail(emailList[i])) {
                countValidEmail++;
            }
        }
        System.out.println("Valid email number is " + countValidEmail);
    }
    //- Đếm số lượng email không hợp lệ trong danh sách.
    private static void countInvalidEmail(String[] emailList) {
        int countInValidEmail = 0;
        for (int i = 0; i < countEmail; i++) {
            if (!validateEmail(emailList[i])) {
                countInValidEmail++;
            }
        }
        System.out.println("Invalid email number is " + countInValidEmail);
    }










}
