
import java.util.*;

import java.io.*;

public class Pattern6 
{
  public static void main(String[] args)throws IOException
  {
    System.out.println("Enter n ");
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    int num=1;
    int i=1;
    while(i<=n){
      int j=1;
      while(j<=i){
        System.out.print(num);
        j++;
        num++;
      }
      System.out.println();
      i++;
    
     
    }
  }
}