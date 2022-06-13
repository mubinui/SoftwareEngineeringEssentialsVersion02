package JavaCore.Exception;

public class MyException extends Exception {
    int a;

    public MyException(int b) {
        a = b;
    }

    public String toString() {
        return "Mubin ->" + a;
    }
}
