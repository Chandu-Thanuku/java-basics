public class DataTypesDemo {
    public static void main(String[] args) {
        // Integer types
        byte b = 127;              // 1 byte
        short s = 32000;           // 2 bytes
        int i = 100000;            // 4 bytes
        long l = 10000000000L;     // 8 bytes (L is required)

        // Floating-point types
        float f = 5.75f;           // 4 bytes (f is required)
        double d = 19.99;          // 8 bytes

        // Character type
        char c = 'A';              // 2 bytes

        // Boolean type
        boolean bool = true;

        // Non-primitive type
        String str = "Hello, Java!";

        // Output
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + bool);
        System.out.println("String value: " + str);
    }
}
