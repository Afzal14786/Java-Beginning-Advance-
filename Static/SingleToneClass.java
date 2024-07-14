package Static;

class CoffeeMachine {
    private float coffeeQnt;
    private float waterQnt;
    private float milkQnt;
    private float sugarQnt;
    static private CoffeeMachine ourMachine = null;

    private CoffeeMachine() {
        coffeeQnt = 3.2f;
        waterQnt = 1.4f;
        milkQnt = 5.5f;
        sugarQnt = 4.3f;
    }

    static public CoffeeMachine getInstance() {
        if (ourMachine == null) {
            ourMachine = new CoffeeMachine();
        }
        return ourMachine;
    }
}

public class SingleToneClass {
    public static void main(String[] args) {
        CoffeeMachine cm = CoffeeMachine.getInstance();
        System.out.println(cm.getClass());
    }
}
