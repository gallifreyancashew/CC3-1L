import java.util.Scanner;
import java.util.Random;
public class Student {
	static int idNum;
	static int hours;
	static int points;
	static double gpa;
	static Scanner sc = new Scanner (System.in);
    public static void main (String [] args){
		Random ran = new Random();
    	System.out.print ("Enter your identification number: ");
    	idNum = sc.nextInt();
    	hours = ran.nextInt((12-1)+1)+1; // ((max-min)+1)+min
    	System.out.print ("Your credit hours earned are: "+ hours +"\n\n");
    	points = hours*4;
    	gpa = gpAve();
    	display();
    }
    public static double gpAve(){
    	double gpAve = points/hours;
    	return gpAve;
    }
    public static void display(){
    	System.out.println ("ID number: "+idNum+"\nHours: "
    		+hours+"\nPoints: "+ points+ "\nGPA: "+gpa);
    }
}