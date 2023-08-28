
import java.util.*;

import java.io.*;

public class Frequency 
{
  public static void main(String[] args)throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int f=sc.nextInt();
    int count=0;
    int rem=0;
    while(n!=0){
      rem=n%10;
      if(rem==f){
        count++;
      }
      n=n/10;
    }
    System.out.println(count);
  }
}
