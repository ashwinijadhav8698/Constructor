/*
Q10. Create a Product class with:
productName
stock
Use a constructor to set values.
 Create an array of 15 products.
 Write a method to count how many products have stock < 10.
Concepts Used:
 ✔ Constructor
 ✔ Array of objects
 ✔ Logical condition (stock < 10)
 ✔ Counter variable
Explanation:
 Loop through array, apply condition, increment count.
*/
 
import java.util.*;

class Product {
    String pname;
    int stock;

    Product(String pname, int stock) {
        this.pname = pname;
        this.stock = stock;
    }
}

public class Q10Cons {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[15];  
        int count = 0; 

        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter product name and stock for product " + (i + 1) + ":");
            String pname = sc.next();
            int stock = sc.nextInt();

            products[i] = new Product(pname, stock);

            if (stock < 10) {   
                count++;
            }
        }

        System.out.println("\nTotal products with stock < 10: " + count);
    }
}