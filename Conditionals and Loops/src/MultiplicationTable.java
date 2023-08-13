// Write a program to print multiplication table of n

import java.util.*;

public class MultiplicationTable 
{
  public static void main(String[] args)
  {
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int num =sc.nextInt();
    int i=1;
    for(i=1;i<=10;i++){
      System.out.println(num*i);
    
    }

  }
}