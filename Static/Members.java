package Static;

class HondaCity {

    // static member is common for all the object
    // it is used as shared data.
    static float price = 100000;
    int x ,  y;


    // Static Method
    static double onroadPrice(String city) {

        // Static method's access only static member's
        switch (city) {
            case "Mumbai" :
                return price + price * 0.10;

            case "Delhi" :
                return price + price * 0.5;

            case "Kolkata" :
                return price + price * 0.3;
        }
        return 0.0;
    }
}


public class Members {
    public static void main(String[] args) {
        HondaCity h1 = new HondaCity();
        System.out.println(h1.price);

        /*
            Static	members	belongs	to	a	class	and	they	can	be	shared	by	all	the
            objects	of	the	class	and	all	the	objects	have	their	own	non-static
            members	.

                Static member's are created inside the Method Area .
         */
        System.out.println(HondaCity.price);
        System.out.println(HondaCity.onroadPrice("Chennai"));
    }
}
