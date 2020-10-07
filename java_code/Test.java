public class Test {
   public static void main(String[] args) {
       String a = "xiaomeng2";
       final String b = "xiaomeng";
       String d = "xiaomeng";
       String c = b + 2;
       String e = d + 2;
       System.out.println((a == c));
       System.out.println((a == e));
   }
}
