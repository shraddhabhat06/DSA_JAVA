
import java.util.*;

import java.io.*;

public class Reverse 
{
  public static void main(String[] args)throws IOException
  {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  int sum=0;   
    int rem=0;
    while(n!=0){
      rem=n%10;
      sum=(sum*10)+rem;
      n=n/10;
    }
    System.out.println(sum);

  }
}