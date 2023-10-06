import java.util.*;

public class BinarySearch {
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
    int start = 0;
    int end   = arr.length -1;
    while((start<=end)){
      int mid = start+(end-start)/2;
      if(target>arr[mid]){
        start=mid+1;
      }else if(target<arr[mid]){
        end=mid-1;
      }
      else{
        return mid;
      }
    }
    return -1;
  }
}
