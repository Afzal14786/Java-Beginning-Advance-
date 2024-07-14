package Lamda_Expression;
@FunctionalInterface
interface MyLamda {
    public void display();
}

/*
class DemoLamda implements MyLamda{
    @Override
    public void display() {
        System.out.println("Learnig Lamda Expression.");
    }
}
 */
public class LamdaDemo {
    public static void main(String[] args) {
        /*MyLamda m = new DemoLamda();
        m.display();
         */

        MyLamda my = ()-> {
            System.out.println("This is how lamda is called!");
        };

        my.display();
    }
}
