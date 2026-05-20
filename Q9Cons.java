/*
Q9. Create an Employee class with:
empId
name
salary


Use constructor to initialize values.
Create an array of 10 employees.
Write a method filterHighSalary() that prints only those employees whose salary > 30000.
Concepts Used:
 ✔ Array of objects
 ✔ Constructor for object initialization
 ✔ Logical operator (salary > 30000)
Explanation:
 Constructor loads employee data.
 Using loops and logical conditions, filter and display selected employees.
*/
import java.util.*;
class Employee
{
  int empid,sal;
  String name;
  Employee(int empid,String name,int sal)  
  {
     this.empid=empid;
	 this.name=name;
	 this.sal=sal;
  }
  public void filterHighSalary()
  {
     if(sal>30000)
	 {
	  System.out.println(empid+" id of employee"+"nameof employee"+ name +" salary of employee is "+sal);
	 }
  }
}
public class Q9Cons
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner (System.in);
	System.out.println("enter the nummber of employee");
	int n=sc.nextInt();
	Employee em[]=new Employee[n];
	for(int i=0;i<em.length;i++)
	{
	System.out.println("Enter the empid,name and salary of employee ");
	int empid=sc.nextInt();
	String name=sc.next();
	int sal=sc.nextInt();
	
	em[i]=new Employee(empid,name,sal);
	}
	for(int i=0;i<em.length;i++)
	{
	  em[i].filterHighSalary();
	}
 }
 
}