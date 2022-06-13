package JavaCore.Exception;

public class ThrowException {
    public static void main(String[] args) {
        //avg();
        try {
            sum();
        }
        finally {
            System.out.println("I am the god ");
        }

    }
    static void avg(){
        try {
            throw new ArithmeticException("Memo");
        }
        catch (ArithmeticException e){
            System.out.println("We caught the arithmetic exception");

        }
    }
    static void sum () throws ArithmeticException{
        System.out.println("Inside Sum function");
        throw new ArithmeticException("Kemo");

    }
}
