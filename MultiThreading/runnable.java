package MultiThreading;

/*
    Achieved multi-threading using *Runnable* interface
 */

class thread implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
}

public class runnable {
    public static void main(String[] args) {
        thread t = new thread();
        Thread th = new Thread(t);
        th.start();

        int i = 1;
        while(true) {
            System.out.println(i + "World Afzal");
            i++;
        }
    }
}
