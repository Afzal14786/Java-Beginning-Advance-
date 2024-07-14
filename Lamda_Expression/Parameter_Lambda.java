package Lamda_Expression;

@FunctionalInterface
interface calculator {
    public int calc(int x, int y);
}

public class Parameter_Lambda {
    public static void main(String[] args) {
        // here no need to declare x and y, compiler automatic deduct their data type //
        calculator cl = (x, y) -> {
            System.out.print("Here Addition Is Happening Between 2 Number's ");
            return x+y;
        };

        System.out.println(cl.calc(10,20));
    }
}
