package ch3;

/**
 * Εκτυπώνει 10 σειρές με αστεράκια σε αύξουσα σειρά
 *
 */
public class StarsAscOrder {


    public static void main(String[] args) {

        int i =1;
        int j = 1;

        while (i<=10){

            j = 1;

            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}