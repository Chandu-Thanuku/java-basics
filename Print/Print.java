public class PrintExample {
    public static void main(String[] args) {
        String name = "Chandu";
        int age = 19;
        double weight = 44.5;

        System.out.print("Using print: ");
        System.out.print(name);

        System.out.println("\nUsing println:");
        System.out.println("Age: " + age);

        System.out.printf("Using printf: Weight = %.1f kg\n", weight);
    }
}
