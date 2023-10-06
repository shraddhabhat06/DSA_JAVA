
import java.util.*;

import java.io.*;

public class Switch 
{
  public static void main(String[] args)throws IOException
  {
     Scanner in = new Scanner(System.in);
     int day=in.nextInt();
        
        // String fruit = in.next();
        
        // switch (fruit) {

        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("A sweet red fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Round fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("Small fruit");
        //         break;
        //     default:
        //         System.out.println("please enter a valid fruit");
        // }
        
        // int day = in.nextInt();
        
        // Original enhanced switch syntax
        
        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        // }
        
        
        // Regular switch syntax
        /*
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        */
        
        // Compact switch syntax
        
        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
        }
      
        // in.close();
    }
}