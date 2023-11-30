package ra.business.util;

public class Validate {

    public static String minString(String str, int min){
        while (str.length() < min){
            System.out.println("must be long >= " + min + ". Please retype: " );
            str = InputMethods.getString();
        }
        return str;
    }

     public static String maxString(String str, int max){
        while (str.length() > max){
            System.out.println("must be long < " + max + ". Please retype: ");
            str = InputMethods.getString();
        }
        return str;
    }

    public static double minNumber(double n, double min){
        while(n < min){
            System.out.println("number must be lager than " + min + ", Please retype: ");
            n = InputMethods.getDouble();
        }
        return n;
    }




}
