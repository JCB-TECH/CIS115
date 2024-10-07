/**
 * Module4_Widget
 */
import java.util.Scanner;
public class Module4_Widget 
{

    public static void main(String[] args) 
    {
        // variables
    int quarter1, quarter2, quarter3, quarter4, annual_widgets;
    double salesTax, salesAmount, total;
    final double TAX = .07, PRICE = 4.79;
    // create scanner variable to hold input from the keyboard
    Scanner k = new Scanner(System.in);
        
            // input
            System.out.print("Enter Sales For Quarter One: ");
            quarter1 = k.nextInt();
            System.out.print("Enter Sales For Quarter Two: ");
            quarter2 = k.nextInt();
            System.out.print("Enter Sales For Quarter Three: ");
            quarter3 = k.nextInt();
            System.out.print("Enter Sales For Quarter Four: ");
            quarter4 = k.nextInt();

            // calulations
            annual_widgets = quarter1 + quarter2 + quarter3 + quarter4;
            salesAmount = annual_widgets * PRICE;
            salesTax = salesAmount * TAX;
            total = salesTax + salesAmount;
            
            //output
            System.out.println("Annual Widgets Sold: " + annual_widgets);
            System.out.println("Widgets Sales Amount: " + salesAmount);
            System.out.println("Sales Tax Collected: " + salesTax);
            System.out.println("Total Amount: " + total);
            k.close();
            
    }
}