package intarray;
import java.util.Scanner;
public class IntArray {

    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int [] array = new int [5];
        for (int ctr=0; ctr<5; ctr++){
            System.out.print ("Enter an integer: ");
            array [ctr]= sc.nextInt();
        }
        System.out.print ("\nFirst to Last: ");
        for (int i=0; i<5; i++){
            System.out.print(array [i]+ " ");
        }
        System.out.print ("\nLast to First: ");
        for (int j=4; j>=0; j--){
            System.out.print(array [j]+ " ");
        }
        System.out.println();
    }
    
}
