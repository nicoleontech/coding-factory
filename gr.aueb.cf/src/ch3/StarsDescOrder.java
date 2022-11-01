package ch3;

/**
 * Εκτυπώνει 10 σειρές με αστεράκια σε αύξουσα σειρά
 *
 */
public class StarsDescOrder {


    public static void main(String[] args) {
 //1st solution
       int i =1;
        int j = 10;

        while (i<=10){

            j = 10;

            while (j >= i){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }

//        //2nd solution
//      int i =1;
//      int j = 10;

    }
}