import java.lang.Runnable;



class myRun implements Runnable{
    public void run(){
        for(int i = 0; i <100; i++) {
            System.out.println("hello world 1");

        }

    }


}



public class TrainClass{
    public static void main(String[] args){
        myRun run1 = new myRun();
        Thread thread = new Thread(run1);
        thread.start();

        System.out.println("Hello World!!!");






    }


}
