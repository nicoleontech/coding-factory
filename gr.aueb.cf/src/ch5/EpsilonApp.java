package ch5;

public class EpsilonApp {

    public static void main(String[] args) {
        final double EPSILON = 0.000005;

        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i <= 10; i++) {
            actual += 0.1;
        }

        System.out.printf("%.20f\n", actual);

//        if (actual == expected) {
//            System.out.println("equals");
//        } else {
//            System.out.println("not equals");
//        }
      
        if (Math.abs(actual - expected) <= EPSILON) {
            System.out.println("EQUAL" +actual);
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
