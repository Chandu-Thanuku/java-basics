import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input of different data types
        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // for full line input

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height (in cm): ");
        float height = sc.nextFloat();

        System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.print("Enter your grade (A/B/C...): ");
        char grade = sc.next().charAt(0);  // Read first character

        // Output
        System.out.println("\n----- User Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Is Student? " + isStudent);
        System.out.println("Grade: " + grade);
    }
}
