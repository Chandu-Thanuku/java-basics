public class IfElseIfExample {
    public static void main(String[] args) {
        int a = 15, b = 25, c = 20;

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest.");
        } else {
            System.out.println(c + " is the largest.");
        }
    }
}
