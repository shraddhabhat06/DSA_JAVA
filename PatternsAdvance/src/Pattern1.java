
import java.util.*;

import java.io.*;

public class Pattern1 
{
  public static void main(String[] args)throws IOException
  {
    System.out.println();
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int i=1;
    while(i<=n){
      int spaces=1;
      while(spaces<=n-i){
        System.out.print(" ");
        spaces=spaces+1;
      }
      int stars=1;
      while(stars<=i){
        System.out.print("*");
        stars=stars+1;
      }
      System.out.println();
      i=i+1;
    }

  }
}