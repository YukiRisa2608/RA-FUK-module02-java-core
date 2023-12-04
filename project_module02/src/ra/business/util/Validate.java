package ra.business.util;

public class Validate {

    public static String minString(String str, int min){
        while (str.length() < min){
            System.err.println("Word must be longer than " + min + " characters. Please retype: " );
            str = InputMethods.getString();
        }
        return str;
    }

     public static String maxString(String str, int max){
        while (str.length() > max){
            System.err.println("\"Word must be shorter than " + max + " characters. Please retype: ");
            str = InputMethods.getString();
        }
        return str;
    }

    public static double minNumber(double n, double min){
        while(n < min){
            System.err.println("Number must be larger than " + min + ", Please retype: ");
            n = InputMethods.getDouble();
        }
        return n;
    }




}
