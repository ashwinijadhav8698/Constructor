/*Q3. Make a NumberCheck class with one field num, initialized by a constructor.
 Write a method checkEvenOdd() that prints whether the number is Even or Odd.
Concepts Used:
 ✔ Constructor
 ✔ Logical % (modulus) operator
Explanation:
 Use num % 2 == 0 to check even; else odd.
*/

import java.util.*;

class NumberCheck
{
  private int num;
  NumberCheck(int num)
  {this.num=num;
  }
  public void checkEvenOdd()
  {
     if(num%2==0)
	 {
	   System.out.println("number is Even ");
	 }
	 else
	 {
	    System.out.println("number is odd");
		
	 }
  }
  
}
public class Q3Cons
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the number to check whather it is even or not");
	  int num=sc.nextInt();
	  
	  NumberCheck nc=new NumberCheck(num);
	  nc.checkEvenOdd();
   }
}