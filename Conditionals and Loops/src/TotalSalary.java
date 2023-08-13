// Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
//     totalSalary = basic + hra + da + allow – pf
// where :
// hra   = 20% of basic
// da    = 50% of basic
// allow = 1700 if grade = ‘A’
// allow = 1500 if grade = ‘B’
// allow = 1300 if grade = ‘C' or any other character
// pf    = 11% of basic.
// Round off the total salary and then print the integral part only.

import java.util.*;
public class TotalSalary {
  public static void main(String[] args ){
    Scanner sc=new Scanner(System.in);
    double basic;
    
    double allow=0;
   
    char grade;
    double totalSalary;
    System.out.println("Enter your Basic Salary");
    basic=sc.nextDouble();
    System.out.print("\n Enter Grade ( A/ B / C ) ");
    grade=sc.next().charAt(0);
    double hra=basic*0.20;
    double da= basic*0.50;
    double pf=basic* 0.11;
    if(grade=='A'){
      allow=1700;
    }
    else if(grade=='B'){
      allow=1500;
    }
    else{
      allow=1300;
    }
    System.out.println(allow);
    
    totalSalary = basic + hra + da + allow - pf;
    System.out.println("Total Salary is "+totalSalary+"");
  }
}
