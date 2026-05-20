/*
Q2. Create a Product class having fields productName and price.
 Initialize using a constructor.
 Write a method isDiscountEligible() that returns true if price > 500, else false.
 In main, print which products get discount.
Concepts Used:
 ✔ Constructor to set values
 ✔ Logical operator (>)
 ✔ Returning boolean
Explanation:
 Constructor loads product values; logical check decides discount eligibility.
*/

/*
import java.util.*;

class Product {
    private String productName;
    private int price;

    
    Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

   
    public boolean isDiscountEligible() {
        return price > 500;  
    }

    
    public void displayDiscountStatus() 
	{
        if (isDiscountEligible()) 
		{
            System.out.println(productName + " is eligible for discount.");
        } 
		else
	    {
            System.out.println(productName + " is not eligible for discount.");
        }
    }
}

public class Q2Cons 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product name:");
        String productname = sc.next();

        System.out.println("Enter the product price:");
        int price = sc.nextInt();

        Product pd = new Product(productname, price);

       
        pd.displayDiscountStatus();
    }
}
*/

import java.util.*;

class Product {
    private String productName;
    private int price;

    
    Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

   
    public boolean isDiscountEligible() {
        return price > 500;  
    }

    
    public void displayDiscountStatus() 
	{
        if (isDiscountEligible()) 
		{
            System.out.println(productName + " is eligible for discount.");
        } 
		else
	    {
            System.out.println(productName + " is not eligible for discount.");
        }
    }
}

public class Q2Cons 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of products");
		int n=sc.nextInt();
		
        Product p[]=new Product[n];
		for (int i=0;i<p.length;i++)
		{
        System.out.println("Enter the product name:");
        String productname = sc.next();

        System.out.println("Enter the product price:");
        int price = sc.nextInt();

        p[i] = new Product(productname, price);
        }
        for(int i=0;i<p.length;i++)
		{
        p[i].displayDiscountStatus();
		}
    }
}