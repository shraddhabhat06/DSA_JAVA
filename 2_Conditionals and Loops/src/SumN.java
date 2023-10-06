import java.util.*;
import java.io.*;


public class SumN {
  public static void main(String[] args) throws IOException{
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number of natural numbers to be added");
  int n =sc.nextInt();
  int i=1;
  int sum=0;
  while(i<=n){
    sum=sum+i;
    i++;
  }
  System.out.print("\nThe sum is "+sum+"\n\n");

  }

}
