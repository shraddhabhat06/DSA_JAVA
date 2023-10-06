
import java.util.*;

import java.io.*;

public class VarArgs {
  public static void main(String[] args)throws IOException
  {
    // fun();
      multiple(2, 3, "Shraddha ", "apple", "mango");
//        demo();
  }

   static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
      System.out.println(a+" "+b+" "+ Arrays.toString(v));

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}

