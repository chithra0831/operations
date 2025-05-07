public class DivisionOperation {
    public DivisionOperation() {
    }
 
    public static void main(String[] var0) {
       byte var1 = 15;
       byte var2 = 0;
 
       try {
          int var3 = var1 / var2;
          System.out.println("Division:" + var3);
       } catch (ArithmeticException var4) {
          System.out.println("Error:Cannot divide by Zero.");
       }
 
    }
 }
 
