package prices;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Prices {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat ("#0.00");
        Scanner sc = new Scanner (System.in);
        double [] prices = new double [20];
        double total =0;
        
        System.out.println ("Please enter 20 prices: ");
        for (int i=0; i<prices.length; i++){
            System.out.print ("Price ["+i+"]: ");
            prices [i] = sc.nextDouble();
            total = total + prices [i];
        }
        double average = total/20;
        System.out.println ("Total: $"+df.format(total)+
                ".\nAverage: $"+df.format(average));
        System.out.println ("All values higher than "+ df.format(average) + " are: ");
        for (int i=0; i<prices.length; i++){
            if (prices[i]>average){
                System.out.println ("-"+prices[i]);
            }
        }
    }
}
