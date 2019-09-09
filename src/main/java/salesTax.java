
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trent
 */
public class salesTax {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the cost purchased");
        double purchase = keyboard.nextDouble();
        double stateSalesTax = purchase * 0.04;
        double countrySalesTax = purchase * 0.02;
        double totalSalesTax = countrySalesTax + stateSalesTax;
        double totalSale = purchase + stateSalesTax + countrySalesTax;
        
        System.out.println("The amount purchased is $" + purchase);
        System.out.println("State Sales Tax is equal to $" + stateSalesTax);
        System.out.println("Country Sales Tax is equal to $" + stateSalesTax);
        System.out.println("The total sales tax is $" + totalSalesTax);
        System.out.println("The total cost of sale is $" + totalSale);
        
    }
    
}
