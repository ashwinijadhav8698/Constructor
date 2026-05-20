/*
Q7. Create a Car class with:
brand
mileage
Use a constructor to set values.
 Write a method getMileageRating():
mileage < 10 → Poor
10 to 15 → Average
15 to 20 → Good
20 → Excellent
Explanation:
 Use nested if-else or else-if ladder inside a class method.
 */
 
 import java.util.*;
 
 class Car
 {  String brand;
    int mileage;
   Car(String brand,int mileage)
   {
      this.brand=brand;
	  this.mileage=mileage;
   }
   public void getMileageRating()
   {
     if (mileage<10)
	 {
	  System.out.println("poor");
	 }
	 else if(mileage>=10 && mileage<15)
	 {
	 	System.out.println("average");
	 }
	 else if(mileage>=15 && mileage<20)
	 {
	   System.out.println("good");
	 }
	 else if(mileage>=20)
	 {
	   System.out.println("Excellent");
	 }
   }
 }
 public class Q7Cons
 {
    public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the brand name and mileage");
	  String brand=sc.next();
	  int mileage=sc.nextInt();
	  
	  Car c=new Car(brand,mileage);
	  c.getMileageRating();
	}
 }