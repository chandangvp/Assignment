
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        System.out.println("Multiplication table of " + num + " is: ");
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}