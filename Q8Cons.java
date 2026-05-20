/*Q8. Create a Student class with 3 subject marks:
 m1, m2, m3 (initialize via constructor)
Write a method:
calculateResult()
Total = m1 + m2 + m3
Percentage = total / 3
If any subject < 35 → print Fail
Else print Percentage and Grade:


≥ 75 → Distinction
≥ 60 → First Class
≥ 50 → Second Class
Else → Pass


Explanation:
 This requires combined logic:
OR logic for fail
Else-if ladder for grading
Arithmetic + constructor initialization
*/
import java.util.*;
class Student
{
   private int m1,m2,m3;
   Student(int m1,int m2,int m3)
   {
     this.m1=m1;
	 this.m2=m2;
	 this.m3=m3;
   }
   public void calculateResult()
   {
     int result =m1+m2+m3;
	 int percen=result/3;
	 
	 if(m1<35 || m2<35 || m3<35)
	 {
	  System.out.println("Student is fail");
	 }
	 else
	 {
	   if(percen>=75)
	   {System.out.println("Distinction");
	   }
	   else if(percen>=60)
	   {System.out.println("first class");
	   }
	   else if(percen>=50)
	   {System.out.println("second class");
	   }
	   else
	   {System.out.println("pass");
	   }
	 }
   }
}
public class Q8Cons
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter the marks for three subject");
	int m1=sc.nextInt();
	int m2=sc.nextInt();
	int m3=sc.nextInt();
	
	Student st=new Student(m1,m2,m3);
	
	st.calculateResult();
  }
}