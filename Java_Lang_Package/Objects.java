package Java_Lang_Package;

// Import The Lang Package .
// By default it's imported //
import java.lang.*;

class MyObject {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "My Object Class";
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == obj.hashCode();
    }
}


public class Objects {
    public static void main(String[] args) {
        Object ob = new Object();
        MyObject ob1 = new MyObject();
        MyObject ob2 = new MyObject();
        System.out.println(ob1.equals(ob2));
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println(ob1.equals(ob2));
    }
}