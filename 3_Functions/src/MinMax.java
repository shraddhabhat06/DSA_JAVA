// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


import java.util.*;
import java.io.*;

public class MinMax
{
  public static void main(String[] args)throws IOException
  {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int min=IsMin(a,b,c);
        int max=IsMax(a,b,c);
        System.out.println("Min:  "+ min + " Max: " + max);
  }
  static int IsMin(int a,int b,int c){
      if(a<b && a<c){
        return a;
      }
      else if (b < a & b < c ){
        return b;
      }
      else{
        return c;
      }
  }

   static int IsMax(int a,int b,int c){

   if(a>b && a>c){
        return a;
      }
      else if (b >a & b>c ){
        return b;
      }
      else{
        return c;
      }

  }



}