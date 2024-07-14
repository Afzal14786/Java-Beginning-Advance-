package Static;

class My {
    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}


public class StaticBlocks {
    public static void main(String[] args) {
        My m = new My();
        System.out.println("In Main Block");
    }
}
