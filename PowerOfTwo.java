package powerOfTwo;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Please enter the number: ");
        number = scanner.nextInt();

        System.out.println("-----Power of 4-----");

        for (int i = 1; i <= number; i *= 4) {

            System.out.println(i);
        }

        System.out.println("-----Power of 5-----");

        for (int j = 1; j <= number; j *= 5) {
            System.out.println(j);
        }
        scanner.close();
    }
}
