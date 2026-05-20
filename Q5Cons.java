/*
Q5.Create a Box class with fields length, width, height.
Initialize them with a constructor.
Write a method isValidVolume() that checks volume:
If volume > 0 → Print Valid box
 Else → Print Invalid dimensions
Concepts Used:
 ✔ Constructor
 ✔ Logical condition (volume > 0)
 ✔ Multiplication operation
Explanation:
 A box is valid only if all dimensions are positive, so the volume remains > 0.
*/

import java.util.*;

class Box
{
   private int len,wid,hei;
   
   Box (int len,int wid, int hei)
   {
      this.len=len;
	  this.wid=wid;
	  this.hei=hei;
   }
   public boolean isValidVolume()
   {   int volume=len*wid*hei;
       return  volume>0;
   }
   
   public void DisplayValidVolume()
   {
      if(isValidVolume())
	  {
	     System.out.println("It is valid box");
	  }
	  else 
	  {
	    System.out.println("it is invalid box");
	  }
   }
}
public class Q5Cons
{
  public static void main (String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length, width and heigth of box");
	int len=sc.nextInt();
	int wid=sc.nextInt();
	int hei=sc.nextInt();
	
	Box b=new Box(len,wid,hei);
	b.DisplayValidVolume();
  }
}