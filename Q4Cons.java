/*Q4. Create an Employee class with fields name and salary, initialized with constructor.
 Write a method validateSalary() that checks:
Salary must be between 10,000 and 1,00,000 (inclusive).
 If valid → Print Valid salary
 Else → Print Invalid salary
Concepts Used:
 ✔ Constructor
 ✔ Logical AND operator (&&)
*/
import java.util.*;

class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void validateSalary() {
        if (salary >= 10000 && salary <= 100000) 
		{
            System.out.println(name + " has a Valid salary");
        } else {
            System.out.println(name + " has an Invalid salary");
        }
    }
}

public class Q4Cons {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees:");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter employee name:");
            String name = sc.next();

            System.out.println("Enter employee salary:");
            int salary = sc.nextInt();

            emp[i] = new Employee(name, salary);
        }

        
        for (int i = 0; i < emp.length; i++) 
		{
            emp[i].validateSalary();
        }
    }
}