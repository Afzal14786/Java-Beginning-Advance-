package Inner_Class;

interface My {
    public void intshow();
}

abstract class Abst_Out {
    abstract void disp();
}

class Abs_out {
    public void show() {
        Abst_Out abs = new Abst_Out() {

            void disp() {
                System.out.println("Abstract Class Method Inside Another Class ");
            }
        };

        abs.disp();

        // Interface Inner Class
        new My() {
            @Override
            public void intshow() {
                System.out.println("Interface Inner Class Method ");
            }
        }.intshow();
    }
}

public class Abstract_Outer {
    public static void main(String[] args) {
        Abs_out abo = new Abs_out();
        abo.show();
    }
}
