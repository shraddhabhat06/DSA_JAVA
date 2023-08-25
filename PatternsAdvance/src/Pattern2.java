
import java.util.*;

import java.io.*;

public class Pattern2 
{
  public static void main(String[] args)throws IOException
  {
    System.out.println();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=1;
    while(i<=n){
      int spaces=1;
      while(spaces<=n-i){
        System.out.print(" ");
        spaces=spaces+1;
      }
      int num=1;
      while(num<=i){
        System.out.print(num);
        num=num+1;
      }
      System.out.println();
      i=i+1;
    }
  }
}