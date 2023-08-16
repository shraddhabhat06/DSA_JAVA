
import java.util.*;

import java.io.*;

public class Pattern11 
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
      while(j<=n){
        System.out.print((char)('A'+ num-1) +" ");
        j++;
        num++;

      }
      System.out.println();
      i++;
    }
  }
}
