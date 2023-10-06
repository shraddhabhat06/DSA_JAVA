
import java.util.*;

public class PrintNatural {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Number of naural numbers to be printed ");
    int n=sc.nextInt();
    int i=1;
    while(i<=n){
      System.out.println(i);
      i++;
    }

  }
}
