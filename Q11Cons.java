/*
Q11. Create a class Product with:
Fields: productId, name, price, category
Constructors:
Default constructor (assign temporary values)
Parameterized constructor (assign all fields)
Task Logic:
Write a method getFinalPrice() that applies:
if category = "Electronics" → 18% GST + 10% discount
if category = "Clothing" → 5% GST + 20% discount
otherwise → only 5% GST
Create 3 objects using all three constructors and find the final price for each.
*/

import java.util.*;
class Product
{
    int proid,price;
	String name ,c;
    Product()
   {
     this(0,"temp",0,"General");
	 System.out.println("this is default constructor");
   }
   Product(int proid,String name,int price,String c)
   {
     this.proid=proid;
	 this.name=name;
	 this.price=price;
	 this.c=c;
   }
   public void getFinalPrice()
   {
      double gst=0.0;
	  double dis=0.0;
	  double famt=0;
	  if(c.equals("Electronics"))
	  {
		gst=(price*18)/100;
		dis=(price*10)/100;
		
		famt=(price+gst-dis);
		System.out.println("final price for "+name+"is:"+famt);
	  }
	   else if(c.equals("Clothing"))
	  {
		gst=(price*5)/100;
		dis=(price*20)/100;
		
		famt=(price+gst-dis);
		System.out.println("final price for "+name+"is:"+famt);
	  }
	  else
	  {
		gst=(price*5)/100;
		
		
		famt=(price+gst);
		System.out.println("final price for "+name+"is:"+famt);
	  }
   }
}
public class Q11Cons
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the number of product ");
	  int p=sc.nextInt();
	  
	  Product pr[]=new Product[p];
	  for (int i=0;i<pr.length;i++)
	  {
	     System.out.println("Enter the prodid");
		 int proid=sc.nextInt();
		 System.out.println("Enter the proname");
		 String pname=sc.next();
		 System.out.println("Enter the price");
		 int price=sc.nextInt();
		 System.out.println("Enter the category");
         String c=sc.next();
		 
		 pr[i]=new Product(proid,pname ,price,c);
		 
	  }
	  for(int i=0;i<pr.length;i++)
	  {
		 pr[i].getFinalPrice();
	  }
   }
}
