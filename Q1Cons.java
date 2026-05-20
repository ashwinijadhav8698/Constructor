/*
Q1. Create a Student class with fields: name, marks.
 Use a parameterized constructor to initialize both fields.
 Write a method checkResult() that prints "Pass" if marks ≥ 35, otherwise "Fail".
 Create 3 student objects and print their results.
Concepts Used:
 ✔ Parameterized constructor
 ✔ If–else logic
Explanation:
The constructor sets the student’s name and marks.
Then you apply simple logical condition (≥ 35).*/

/*
class Student
{
    private String name;
	private int marks;
   public  Student(String name,int marks)
   {
      this.name=name;
	  this.marks=marks;
   }
   public void checkResult()
   {
      if(marks<=35)
	  {
	    System.out.println(name  +" fail in exam");
	  }
	  else
	  {
	    System.out.println(name + " pass in exam");
	  }
   }
}
public class Q1Cons
{
   public static void main(String args[])
   {
      new Student("rani ",50).checkResult();
	  new Student("maya " ,38).checkResult();
	  new Student("rekha",45).checkResult();
   }
}*/
import java.util.*;
class Student
{
    private String name;
	private int marks;
    Student(String name,int marks)
   {
      this.name=name;
	  this.marks=marks;
   }
   public void checkResult()
   {
      if(marks<=35)
	  {
	    System.out.println(name  +" fail in exam");
	  }
	  else
	  {
	    System.out.println(name + " pass in exam");
	  }
   }
}
public class Q1Cons
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	     Student arr[]=new Student[3];
	  for(int i=0;i<arr.length;i++)
	  {
	   System.out.println("Enter the name of students");
	   String  name=sc.next();
	   
	   System.out.println("Enter the marks of student");
	   int marks=sc.nextInt();
	   
	   arr[i] =new Student(name,marks);
	   
	  }
	  
	  for(int i=0;i<arr.length;i++)
	  {
		arr[i].checkResult();
	  }
   }
}