
import java.util.*;

import java.io.*;

public class Pattern4 
{
  public static void main(String[] args)throws IOException
  {
    System.out.println();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=1;
    while(i<=n){
      int stars=1;
      while(stars<=n-i+1){
      System.out.print("*");
      stars=stars+1;
      }
      i=i+1;
      System.out.println();
      
    }
  }
}