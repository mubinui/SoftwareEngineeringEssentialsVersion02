package JavaCore.Exception;

public class UserException01 {
    public static void main(String[] args) {
        try{
            throw new MyException(5);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

