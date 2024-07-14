package MultiThreading;
/*
    Acheived multithreading using *Thread* Class
 */
class MyThread extends Thread {
    int i = 1;
    public void run() {
        while(true) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
//        System.out.println(t.getId());
//        System.out.println(t.getName());
//        System.out.println(t.getPriority());
//        System.out.println(t.getState());
    }

}
