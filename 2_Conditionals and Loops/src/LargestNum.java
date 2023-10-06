
import java.util.*;

import java.io.*;

public class LargestNum 
{
  public static void main(String[] args)throws IOException
  {
    System.out.println();
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    int b =sc.nextInt() ;
    int c = sc.nextInt();
    int maximum =Math.max(c,Math.max(a,b));
    System.out.println(maximum);
      
    }
  }
