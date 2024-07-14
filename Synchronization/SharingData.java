package Synchronization;

class MyData {
//    void printData(String name) {
//        synchronized (this) {
//            for (int i = 0; i  < name.length(); i++) {
//                System.out.print(name.charAt(i) + " ");
//            }
//        }
//    }
/*
    There are two ways to synchronize a perticular thread . ..
        -> We can synchronize the actual mechanizm like above mention example where the loop is synchronized
        -> and 2nd one we can directly synchronize the method which is mention below .
 */
    synchronized void printData(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
            try {
                Thread.sleep(100);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    MyData data;

    Thread1(MyData data) {
        this.data = data;
    }

    @Override
    public void run() {
        data.printData("Hello Afzal");
    }
}

class Thread2 extends Thread {
    MyData dat;

    Thread2(MyData dat) {
        this.dat = dat;
    }

    @Override
    public void run() {
        dat.printData("How Are You Dude !");
    }
}

public class SharingData {
    public static void main(String[] args) {
       MyData data = new MyData();
       Thread1 th = new Thread1(data);
       Thread2 th2 = new Thread2(data);

       th.start();
       th2.start();
    }
}
