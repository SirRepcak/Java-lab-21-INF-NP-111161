package Lab10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadanie1{

    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            Thread thread = new Thread(new MyRunnable(i));
            thread.start();
        }

    }

}
class MyRunnable implements Runnable{

    private final int threadId;

    MyRunnable(int threadId){
        this.threadId = threadId;
    }

    @Override
    public void run() {
        try {
            while (true) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String currentDate = dateFormat.format(new Date());

                System.out.println("ID: " + threadId + "  Data: " + currentDate);

                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }


