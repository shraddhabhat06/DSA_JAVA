
import java.util.*;

import java.io.*;

public class Fibonacci 
{
  public static void main(String[] args)throws IOException
  {
    System.out.println();
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int a=0;
    int b=1;
    int flag=2;
    System.out.print(a+" "+b+" ");
    while(flag<=n){
      int temp= b;
      b=b+a;
      a=temp;
      System.out.print(b+" ");     
      flag++; 
    }
  }
}