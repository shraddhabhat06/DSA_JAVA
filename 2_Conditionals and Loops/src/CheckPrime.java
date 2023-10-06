import java.util.*;
import java.io.*;

public class CheckPrime {
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int n=2;
    
    
    while(n<num ){
      if (num%n==0){
        
         System.out.println("not prime");
         return;
      }
      n=n+1;
    }
    System.out.println("prime");
      
      
    
  }
}
         
     

