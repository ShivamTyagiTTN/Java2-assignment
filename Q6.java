//6. WAP showing try, multi-catch and finally blocks.

public class Q6 {

    public static void main(String[] args) {

        try{
            int a;
            a=10/0;
            System.out.println(a);
        }

        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception");
        }

        finally {
            System.out.println("Finally executed");
        }
    }
}