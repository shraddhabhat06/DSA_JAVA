public class TypeConversion {
  public static void main(String[] args){
    int a = 10;
    // Explicit conversion from one type to another.
    double b =(double)a/2;
   System.out.println("b= "+b);
   float c= (float)(3*4)/5 ;
   System.out.println("c="+c );
   char d= 's';
   int e= (int)d ;//ASCII value of A is 65, so adding 1
   System.out.println("e= " + e);
   System.out.println(2/4);
   System.out.println(2/5);
   System.out.println(((double)2/5));
   System.out.println((float)3/8);
   System.out.println (3/8);
   System.out.println((int)b);
  }
}
