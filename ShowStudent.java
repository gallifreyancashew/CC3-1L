import java.util.Scanner;
import java.util.Random;
public class ShowStudent {
 	private int idNumber;
	private int credHours;
	private int points;
	private double gpa;
	public static Scanner sc = new Scanner (System.in);

    public void Student (){
    	idNumber = 5;
    	credHours = 2;
    	points = 8;
    	gpa = 4.0;
    }
    public double gpAve(int points, int credHours){
    	double gpAve = points/credHours;
    	return gpAve;
    }
    public void display(){
    	System.out.println ("ID number: "+idNumber+
    		"\nHours: "+credHours+"\nPoints: "+
    		points+ "\nGPA: "+gpa);
    }    
    public static void main (String [] args){
		Student newStudent = new Student();
		newStudent.display();
    }
}