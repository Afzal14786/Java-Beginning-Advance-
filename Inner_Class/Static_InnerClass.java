package Inner_Class;

class StaticOuter {
    static int age = 20;
    int x = 90;

    static class StaticInner {
        public void show() {
            System.out.println(age);
//            System.out.println(x);  // Not Allowed
        }

    }
}

public class Static_InnerClass {
    public static void main(String[] args) {
        StaticOuter.StaticInner st = new StaticOuter.StaticInner();
        st.show();
    }
}
