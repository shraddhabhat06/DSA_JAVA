
import java.util.*;

import java.io.*;

public class Pattern2
{
  public static void main(String[] args)throws IOException
  {
    System.out.println("Enter n");

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=1;
    while (i<=n){
      int j=1;
      while(j<=n){
      System.out.print(i+" ");
      j++;
      }
      System.out.println();
      i++;
    }
  }
}