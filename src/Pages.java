import java.util.Scanner;

import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);		// line 1
        System.out.println("Please enter your age:");		// line 2
        int age = scanner.nextInt();						// line 3
        System.out.println(age);

        int minDateAge = (100 - age);
        System.out.printf("%d-year olds should read at least %d pages before giving up on a book.%n", age, minDateAge);

        scanner.close();
    }
}



