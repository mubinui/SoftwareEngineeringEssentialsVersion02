package JavaCore.TypeCasting;

public class Casting {
    public static void main(String[] args) {
        //We are creating Parent class object using child class
        //This is upcasting (Java Supports this )
        Person p = new Teacher();
        p.display();
        //output Teacher class
        //Down casting
        Teacher t = (Teacher) new Person();
        t.display();
        // Runtime exception

    }
}
