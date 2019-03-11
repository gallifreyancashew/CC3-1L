package exponent2;

import java.util.Scanner;
public class Exponent2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();
        System.out.println("The square value of "+input+" is "+square(input)+".");
        System.out.println("The cube value of "+input+" is "+cube(input)+".");
    }
    public static int square(int input){
        int square = input * input;  
        return square; 
    }
    public static int cube(int input){
        int cube = square(input)*input;
        return cube;
    }
    
}