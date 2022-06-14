package JavaCore.Threading;

public class ThreadInterfaceImplementation implements Runnable{
    @Override
    public void run() {
        // what will work as thread
        try {
            System.out.println("Thread Interface Object"+Thread.currentThread().getId());

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
