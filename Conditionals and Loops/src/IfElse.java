
import java.io.IOException;
import java.util.Scanner;
public class IfElse {

  public static void main(String[] args)throws IOException{

    Scanner s= new Scanner(System.in);
    int a,b;
    a=s.nextInt();
    b=s.nextInt();
    if(a>b){
      System.out.println("The first number is greater than the second");
    }else{
      System.out.println("the second number is greater than the first one ");
    }
    System.out.println("Outside");
  }
}