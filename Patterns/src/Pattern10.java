
import java.util.*;

import java.io.*;

public class Pattern10 
{
  public static void main(String[] args)throws IOException
  {
    System.out.println("Enter n");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=1;
    while(i<=n){
      int j=1;
      while(j<=i){
        System.out.print((char)('A'+i-1));
        j++;
      }
      System.out.println();
      i++;
    }
  }
}