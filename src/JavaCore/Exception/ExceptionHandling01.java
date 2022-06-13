package JavaCore.Exception;

import java.text.ParseException;

public class ExceptionHandling01 {
    public static void main(String[] args) {
        String str = "Mubin";
        System.out.println(str.length());
        try {
            int a = 20, b=0;
            int sum = a/b;
            System.out.println(sum);
        }

        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("You can do the normal things here ");

        }
        try {
            int num = Integer.parseInt("Mubin UIC");
            System.out.println(num);
        }
        catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println("Number Format Exception occured So What we can still do things ");

        }
        try {
            int a [] = new int[5];
            a[6] = 5;

        }
        catch (ArrayIndexOutOfBoundsException a ){
            a.printStackTrace();
            System.out.println("Nothing Happend Chill baby");
        }

        finally {
            System.out.println("I am the boss ");
        }

    }

}
