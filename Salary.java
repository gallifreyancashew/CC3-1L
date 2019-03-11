package salary;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Salary {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0,000.00");
        Scanner sc = new Scanner (System.in);
        System.out.print ("Please enter your hourly pay rate: ");
        double payRate = sc.nextInt();
        System.out.print ("Please enter regular hours: ");
        int regHours = sc.nextInt();
        System.out.print ("Please enter overtime hours: ");
        int overHours = sc.nextInt();
        System.out.print ("Your overtime rate is ₱"+df.format(overtime(payRate,regHours,overHours))+"\n");
        
    }
    public static double overtime (double payRate, int regHours,  int overHours){
        double overtime = (regHours*payRate)+overHours*(1.5*overHours);
        return overtime;
    }
}
