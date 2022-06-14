package JavaCore.Threading;

public class ThreadTester {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i <10 ; i++) {
            Thread01 thread01 = new Thread01(i);
            //without start method thread will not work
            thread01.start();
            thread01.setPriority(Thread.MIN_PRIORITY);
            //thread01.wait();

        }
        System.out.println("----------------------------------------------------");
        for (int i = 0; i <10 ; i++) {
            Thread object1 = new Thread(new ThreadInterfaceImplementation());

            //without start method thread will not work
            object1.start();
            object1.setPriority(Thread.MAX_PRIORITY);
            //thread01.wait();

        }
    }
}
