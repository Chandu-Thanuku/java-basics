import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();

        // Random integer between 0 to 99
        int randomInt = rand.nextInt(100);  // 0 to 99
        System.out.println("Random integer (0-99): " + randomInt);

        // Random integer between 1 to 10
        int random1to10 = rand.nextInt(10) + 1;
        System.out.println("Random integer (1-10): " + random1to10);

        // Random float between 0.0 to 1.0
        float randomFloat = rand.nextFloat();
        System.out.println("Random float (0.0-1.0): " + randomFloat);

        // Random boolean
        boolean randomBool = rand.nextBoolean();
        System.out.println("Random boolean: " + randomBool);

        // Random character from A-Z
        char randomChar = (char)(rand.nextInt(26) + 'A');
        System.out.println("Random character (A-Z): " + randomChar);

        // Random using Math.random()
        double mathRandom = Math.random();  // 0.0 to <1.0
        System.out.println("Using Math.random(): " + mathRandom);
    }
}
