package Lamda_Expression;
import java.util.*;

@FunctionalInterface
interface lamDem {
    public void Display(String str);
}

class Lambda_Demo {
    public static void rev_str(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("The Reversed String Is : " + sb);
    }
}

/*
    Lambda As A Parameter
 */
@FunctionalInterface
interface lamdemo2 {
    public void disp();
}

class Lam_Par {
    public void uselam(lamdemo2 lm) {
        lm.disp();
    }
}

class use_lambda {
    public void use() {
        Lam_Par lambda_paramete = new Lam_Par();
        lambda_paramete.uselam(()-> {
            System.out.println("Lambda Expression Use As Parameter");
        });
    }
}
public class Method_Referance {

    public static void main(String[] args) {
//        lamDem Ld = Lambda_Demo::rev_str;
//        Ld.Display("Md Afzal Ansari");

        use_lambda use = new use_lambda();
        use.use();


    }
}
