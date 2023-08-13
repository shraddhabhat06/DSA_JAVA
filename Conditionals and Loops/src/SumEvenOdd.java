// Write a program to input an integer 'n' and print the sum of all its even digits and sum of all its odd digits separately.


// Digits mean numbers, not the places! That is, if the given integer is "132456", even digits are 2, 4 and 6 and odd digits are 1, 3 and 5.
import java.util.*;

public class SumEvenOdd {  

    public static void main(String[] args)
    {
      System.out.println();
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int num=0;
      int even=0;
      int odd=0;
      while(n>0){
          num=n%10;
          n= n/10;
          if(num % 2==0) {
            even=even+num;
          }
            else{
              odd=odd+num;
            }
      }
      System.out.print("Sum of Even Numbers: "+even+"\t");
      System.out.print("\nSum of Odd numbers :"+odd+" ");
    }
  }

