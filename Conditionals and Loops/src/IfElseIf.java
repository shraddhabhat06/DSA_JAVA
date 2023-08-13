import java.util.Scanner;

public class IfElseIf {
  public static void main(String [] args){
    Scanner s= new Scanner(System.in);
    int a,b;
    a=s.nextInt();
    b=s.nextInt();
    if(a>b){
      System.out.println("The first number is greater than the second");
    }else if(b>a){
      System.out.println("the second number is greater than the first one ");
    }else{
      System.out.println("both are equal to each other.");
    }
    
  }
}
