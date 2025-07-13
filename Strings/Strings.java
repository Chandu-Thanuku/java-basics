import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();  // Reads full line (with spaces)

        // Output original string
        System.out.println("\nOriginal Name: " + name);

        // String methods (shortcuts/features)
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Length: " + name.length());
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Last character: " + name.charAt(name.length() - 1));
        System.out.println("Does it contain 'a'? " + name.contains("a"));
        System.out.println("Substring (first 3 letters): " + name.substring(0, 3));
        System.out.println("Replace 'a' with '@': " + name.replace('a', '@'));
        System.out.println("Trimmed: " + name.trim()); // Removes leading/trailing spaces

        // Comparing strings
        String check = "Chandu";
        System.out.println("Equals 'Chandu'? " + name.equals(check));
        System.out.println("EqualsIgnoreCase 'chandu'? " + name.equalsIgnoreCase("chandu"));
    }
}
