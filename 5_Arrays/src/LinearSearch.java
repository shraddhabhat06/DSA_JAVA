import java.util.*;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    int ans;
    int target;
    
    for (int i = 0;i<arr.length ;++i){ 
      arr[i]=sc.nextInt();
    }
    target=sc.nextInt();
    
    ans= Search(arr, target);
    System.out.println(ans);

  

    
  }
  static int Search(int[] arr, int target){
    if(arr.length==0){
      return -1;
    }
     for (int i=0;i<arr.length;i++){
      if(arr[i]==target){
        return i;
      }
     }
     return -1;

  }
}
