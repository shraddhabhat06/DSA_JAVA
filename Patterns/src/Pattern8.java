
import java.util.*;

import java.io.*;

public class Pattern8 
{
  public static void main(String[] args)throws IOException
  {
    System.out.println("Enter n");
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    int i=1;
   
    while(i<=n){
      int j=1;
      int num=i;
      while(j<=i){
        System.out.print(num);
        num--;
        j++;
      }
      System.out.println();
      i++;
      
    }
  }
}