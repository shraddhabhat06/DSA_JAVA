import java.util.Scanner;


public class TakingInput {
  public static void main(String[] args){
    int a,b;
     double c;
     long d;
    Scanner s= new Scanner(System.in); 
    System.out.println("Enter two numbers a,b,c,d");
    a= s.nextInt();
    b= s.nextInt();
    c= s.nextDouble();
    d= s.nextLong();

    System.out.println("a= "+ a);
    System.out.println("b="+  b );
    System.out.println("c= "+c) ;
    System.out.println("d= "+d);

    System.out.println("Enter a sentence, string and a character");
    String str =s.nextLine() ; // this is to take the input as one line
    String word =s.next();
    char ch = s.next().charAt(0); // character input
   
    
    System.out.println("The sentence is " + str);
    System.out.println("The word is " + word);
  }
}
