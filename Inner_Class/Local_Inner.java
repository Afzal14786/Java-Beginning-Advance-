package Inner_Class;

class Outer_class {
    public void display() {
        class Inner {
            public void show() {
                System.out.println("Method Of Inner Class ");
            }
        }

//        Inner i = new Inner();
//        i.show();

        new Inner().show();


    }
}

public class Local_Inner {
    public static void main(String[] args) {
        System.out.println("Local Inner Class . . .");
        Outer_class o = new Outer_class();
        o.display();
    }
}
