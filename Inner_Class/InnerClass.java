package Inner_Class;

/*
    Class Inside a class known as "Inner Class" .
 */

class Outer {
    int x = 20;   // Outer Class Data Member .

    class Inner {
        int y = 40;  // Inner Class Data Member .
        void innerDisplay() {
            System.out.println("I Am Inner Class's Display");
            System.out.println("From Inner Class I Can Access The Outer Class Data Member's" + x);
            System.out.println(y);
        }
    }

    void outerDisplay() {  // Outer Class Method
        System.out.println("I Am Outer Class's Display");
        System.out.println("For Accessing The Data Member's Of Inner Class, We Need To create an object of inner class");
        Inner in = new Inner();
        System.out.println("Date Menber Of Inner Class Is Access Via Inner Class Object Only : " + in.y);
        in.innerDisplay();
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerDisplay();

        System.out.println("-- Accessing The Inner Class --");
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
    }
}
