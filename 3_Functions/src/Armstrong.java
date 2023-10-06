
import java.util.*;

import java.io.*;

public class Armstrong
{
  public static void main(String[] args)throws IOException
  {
    
    Scanner sc=new Scanner(System.in);
    for(int i=10;i>=10 && i<=1000;i++){
     if( IsArmstrong(i)){
      System.out.print(i+" ");
     }
    }
    sc.close();
    
  }

  static boolean IsArmstrong(int n){

    
      int o=n;
      double sum=0;
     
     while(n!=0){
      int rem=0;      
      rem=n%10;
      sum=sum+Math.pow(rem,3);
      n=n/10;
    }
    return sum==o;     
        
    

  }
}
