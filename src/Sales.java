import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Sales {
    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */

    public static void main(String[] args) {

        double price,discountConverted,tax;
        int discount,quantity,salesTax;
        
        price = Double.parseDouble((JOptionPane.showInputDialog("what is the price?")));

        discount =Integer.parseInt((JOptionPane.showInputDialog("what is the discount?")));

        quantity =Integer.parseInt((JOptionPane.showInputDialog("what is the quantity?")));

        salesTax = Integer.parseInt((JOptionPane.showInputDialog("what is the sales tax?")));

        discountConverted = (double)discount/100.0;

        tax = 7;
        final double Tax = tax/100.0;

        double subTotal = price * quantity;
        double subTotalDiscounted = subTotal * (1 - discountConverted);
        double taxTotal = subTotalDiscounted * Tax ;
        double totalCost = subTotalDiscounted + taxTotal ;

        DecimalFormat roundTo2 = new DecimalFormat("0.00");

        JOptionPane.showMessageDialog(null, "Subtotal: $" + roundTo2.format(subTotalDiscounted) + "\nTax Total: $" +
                roundTo2.format(taxTotal) + "\nTotal Cost: $" + roundTo2.format(totalCost));

        System.exit(0);

    }

}
