import java.util.*;

public class StringSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
     char target = sc.next().charAt(0);
     int index=Search(name,target);
     System.out.println(index);


  }
  static int Search(String name , char target){
    if(name.length()==0){
      return -1;
    }
     for(int i=0;i<name.length();i++){
      if(name.charAt(i)==target){
        return i;
      }
     }


    return -1;

  }
  
}
