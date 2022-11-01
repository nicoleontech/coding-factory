package ch3;

/**
 *
 */
public class BreakAndContinueApp {

    public static void main(String[] args) {
        int i = 1;
        int result = 1;

        while (i<= 10){
            i++;
            if( i ==5){
                break;
            }
        }

        while ( i<= 10){
            i++;
            if (i==5){
                continue;
            }
            result = result +1;
        }

    }
}
