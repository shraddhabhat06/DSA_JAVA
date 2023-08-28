
// Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.


// 1, if the character is an uppercase alphabet (A - Z).
// 0, if the character is a lowercase alphabet (a - z).
// -1, if the character is not an alphabet.
import java.util.*;

public class CharacterCase {
  public static void main(String[] args) throws Exception{
  
    Scanner sc = new Scanner(System.in);
    char ch;
    System.out.println("Enter any character: ");
    ch=sc.next().trim().charAt(0);
    int a= ch;
    if(a>='A' && a<='Z'){
      System.out.print("1");
    }else if(a>='a' && a<='z'){
       System.out.print("0");
    }else{
      System.out.print("-1");
    }
  
  }
}
