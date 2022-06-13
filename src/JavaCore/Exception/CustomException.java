package JavaCore.Exception;

import java.util.Scanner;

public class CustomException {
    public static void validateInput(int number) throws InvalidInputException{

        if (number>100){
            throw new InvalidInputException("Exception");

        }
        System.out.println("Valid Input");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number less than 100 : " );
        int number = sc.nextInt();
        try{
            validateInput(number);
        }
        catch (InvalidInputException e ){
            e.printStackTrace();
        }
    }
}
