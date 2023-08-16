
import java.util.*;

import java.io.*;

public class  PowerOfNumber
{
  public static void main(String[] args)throws IOException
  {
  Scanner sc=new Scanner(System.in);
    int p=1;
    int n=sc.nextInt();
    int i=sc.nextInt();
    while(i>0){
      p= p * n;
      --i;
    }
    System.out.println("Power is "+ p);
  }
}