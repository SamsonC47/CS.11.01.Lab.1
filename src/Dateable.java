import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);		// line 1
        System.out.println("Please enter your age:");		// line 2
        int age = scanner.nextInt();						// line 3
        System.out.println(age);

        int minDateAge = (age / 2) + 9;
        System.out.printf("%d-year olds should date somebody who is at least %d years old.%n", age, minDateAge);

        scanner.close();
    }
}
