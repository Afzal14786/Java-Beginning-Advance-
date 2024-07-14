package Static;

class FINAL {
    final int AGE = 32;
    final int MIN;
    static final int MAX;

    FINAL() {
        MIN = 98;
    }

    static {
        MAX = 87;
        System.out.println(MAX);
    }
}
public class FinalMember {
    public static void main(String[] args) {
        FINAL f = new FINAL();
    }
}
