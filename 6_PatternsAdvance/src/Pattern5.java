
import java.util.*;

import java.io.*;

public class Pattern5

{
  public static void main(String[] args)throws IOException
  {
    System.out.println();
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int i=1;
    while(i<=n){
      int num=1;
          
        while(num<=n-i+1){
          System.out.print(n-i+1);
          num=num+1;
      }
      i=i+1;
      System.out.println();
    
    }

  }
}