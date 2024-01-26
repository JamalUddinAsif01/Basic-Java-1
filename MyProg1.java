
package Program1;

public class MyProg1 {

    public static void main(String[] args) {
       // Simple program with if-else condition and a for loop

        int n = 5;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            } else {
                System.out.println("Odd number: " + i);
            }
        }
    }
}
