package application;

import java.util.Locale;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String name;
        double price;
        int quantity;

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextDouble();
        System.out.print("Quantity: ");
        quantity = sc.nextInt();


        double totalValueInStock = price * quantity;

        System.out.println("Product data: " + name + ", " + price + ", " + quantity);

        System.out.println("Total: " + totalValueInStock);
    }

}
    