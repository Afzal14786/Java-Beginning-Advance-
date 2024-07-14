package Intarface;


class Phone {
    void call() {
        System.out.println("Make A Call");
    }

    void sms() {
        System.out.println("Send A SMS");
    }
}
/*
    An Interface Extends Another Interface
 */
interface I_camera {
    int x = 20;   // By Default Constant and Final and Static
    void click();
    void record();

    // Default Method Is Not Mendetory to Implement Or Override //
    default void camera_lense() {
        System.out.println("It's Has A Awasome Camera Yr . . .");
    }
}

interface I_music {
    void start_music();
    void change_music();
    void stop_music();
}

class Smartphone extends Phone implements I_camera, I_music {

    public void call() {
        System.out.println("Smart Phone Video Calling Is On.");
    }

    public void sms() {
        System.out.println("Sending SMS via Smart Phone .");
    }

    @Override
    public void click() {
        System.out.println("Smart Phone Photo Clicking .");
    }

    @Override
    public void record() {
        System.out.println("Smart Phone Video Recording .");
    }

    @Override
    public void start_music() {
        System.out.println("Smart Phone Music On");
    }

    @Override
    public void change_music() {
        System.out.println("Smart Phone Music Change . . ");
    }

    @Override
    public void stop_music() {
        System.out.println("Smart Phone Music Stop .");
    }
}

public class ExampleInterface {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone();
        sp.call();
        sp.click();

        I_music m = new Smartphone();
        m.change_music();

//        I_camera cam = new Smartphone();
        Smartphone sm = new Smartphone();
        sm.camera_lense();

    }
}
