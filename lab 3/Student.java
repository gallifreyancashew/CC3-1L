package student;
import java.util.Scanner;
public class Student {
    public int idNum=0;
    public int hours=0;
    public int points;
    public double gpa;
    public Scanner sc = new Scanner (System.in);
    public Student (int id, int credHours){
        idNum = id;
        hours = credHours;
        getPoints();
    }
    public int getPoints (){
        points = hours*4;
        return points;
    }
    public double getGPA (){
    	double gpa = points/hours;
    	return gpa;
    }
    public void display(){
    	System.out.println ("ID number: "+idNum
                +"\nHours: " +hours+"\nPoints: "
                + points+ "\nGPA: "+getGPA());
    }
}