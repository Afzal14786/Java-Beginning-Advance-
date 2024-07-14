package Synchronization;

class inter_data_thread {
    int value = 0;
    boolean flag = true;
    synchronized public void set(int value) {
        while (flag != true) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.value = value;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int count = 0;
        while (flag != false) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        count = value;
        flag = true;
        notify();
        return count;
    }
}

class Producer extends Thread {
    inter_data_thread data;

    Producer(inter_data_thread data) {
        this.data = data;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            data.set(count);
            System.out.println("Producer Produce : " + count);
            count++;
        }
    }
}

class Customer extends Thread {
    inter_data_thread data;
    public Customer(inter_data_thread data) {
        this.data = data;
    }

    public void run() {
        int val = 0;
        while (true) {
            val = data.get();
            System.out.println("Consumer Consume : " + val);
        }
    }
}

public class Inter_Thread_Communication {
    public static void main(String[] args) {
        inter_data_thread data = new inter_data_thread();

        Producer pro = new Producer(data);
        Customer cus = new Customer(data);

        pro.start();
        cus.start();
    }
}
