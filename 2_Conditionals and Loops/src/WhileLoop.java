import java.util.*;

public class WhileLoop {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number of times hello should be printed");
    int n=sc.nextInt();
    int i=0;
    while( i<n){
      System.out.println("Hello");
      i++;
    }
  }
}
