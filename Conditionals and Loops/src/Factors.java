
// Write a program that takes a number as input and prints all its factors except 1 and the number itself.. If the number has only two factors (1 and the number itself), then the program should print -1.

import java.util.*;

import java.io.*;

public class Factors 
{
  public static void main(String[] args)throws IOException
  {
    System.out.println();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean factexist=false;
    int div=2;
    while(div<n){
      if(n%div==0){
        factexist=true;
        System.out.println(div+" ");
        
              
      }
      div++;
      
    }
    if(!factexist){
      System.out.println("-1");
    }
  }

}

   
   