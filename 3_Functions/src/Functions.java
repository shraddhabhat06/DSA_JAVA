
import java.util.*;

import java.io.*;

public class Functions 
{
  public static void main(String[] args)throws IOException
  {
      // String message= myGreet("Shraddha");
      //  System.out.println("message is "+message);
      int []ar={10,20,30,40,50};
      
      swap(ar);
        System.out.println(Arrays.toString(ar));

  }
  // static String myGreet(String name){
    
  //   System.out.println("Hello World "+name);
  //   return name;
  // }
  static void swap(int [] arr){
    
    int temp=arr[0];
    arr[0] =arr[1];
    arr[1]=temp;
    System.out.println(Arrays.toString(arr));
    
  }

}

