// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).


import java.util.*;

import java.io.*;

public class PythTriplet 
{
  public static void main(String[] args)throws IOException
  {
    
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(IsTriplet(a,b,c)){
          System.out.println("Is triplet");
        }
        else{
          System.out.println("Not Triplet");
        }
  }

  static boolean IsTriplet(int a,int b,int c){
      return(a*a+b*b==c*c);
  }
}