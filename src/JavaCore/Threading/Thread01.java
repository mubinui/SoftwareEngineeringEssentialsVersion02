package JavaCore.Threading;

public class Thread01 extends Thread {
    public int id;
    public Thread01(int id ){
        this.id = id ;
    }
    @Override
    public void run(){
        // what will work as thread
        try {
            System.out.println("Thread Object"+id);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
