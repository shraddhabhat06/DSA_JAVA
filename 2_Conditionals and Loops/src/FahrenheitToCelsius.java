
// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

import java.io.IOException;
import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int S= sc.nextInt();
    int E = sc.nextInt();
    int W =sc.nextInt();
    int C;
    while(S<=E){
      C=(S-32)*5/9;
      System.out.println(S+ " "+ C);
      S=S+W;
    }



  }
}
