package MultiThreading;

class Thread_method extends Thread {
    int count = 1;
    public void run() {

        while (true) {
            System.out.println(count++ + " Hello Afzal");
//            try {
//                Thread.sleep();
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
        }
    }
}
public class ThreadCons_methods {
    public static void main(String[] args) {
        Thread_method th = new Thread_method();
        th.start();

        int c = 1;
        while(true) {
            System.out.println("Afzal Hello " + c++);
            Thread.yield();
        }
    }
}
