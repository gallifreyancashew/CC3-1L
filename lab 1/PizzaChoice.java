package pizzachoice;
import javax.swing.*;
import javax.swing.JPanel;
public class PizzaChoice {
    public static void main(String[] args) {
        final JPanel panel = new JPanel();
        String [] sizes = {"S", "M", "L", "X"};
        double [] prices = {6.99, 8.99, 12.50, 15.00};
        char answer;
        JOptionPane.showMessageDialog (null, "Welcome to the Pizzeria, please place an order.");
        
        do {
            String choice = JOptionPane.showInputDialog (null, "Enter Pizza Size (S, M, L or X): ").toUpperCase();
            switch (choice){
                case "S":
                    int i=0;
                    JOptionPane.showMessageDialog(null, "The price of a small pizza is $"+prices[i]+".");
                    break;
                case "M":
                    i=1;
                    JOptionPane.showMessageDialog(null, "The price of a medium pizza is $"+prices[i]+".");
                    break;
                case "L":
                    i=2;
                    JOptionPane.showMessageDialog(null, "The price of a large pizza is $"+prices[i]+".");
                    break;
                case "X":
                    i=3;
                    JOptionPane.showMessageDialog(null, "The price of an extra large pizza is $"+prices[i]+".");
                    break;
                default: 
                    JOptionPane.showMessageDialog (panel, "A deprecated call", "Warning",
        JOptionPane.WARNING_MESSAGE);    
            }
            answer = JOptionPane.showInputDialog (null, "Do you want to try again? \nPress Y to continue.").charAt(0);
            if (answer!='Y'){
                JOptionPane.showMessageDialog (null, "Thank you for shopping with us.");
                System.exit(0);
            }
        } while (answer == 'Y'||answer=='y');    
    }
    
}
