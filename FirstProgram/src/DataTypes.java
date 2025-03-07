public class DataTypes {
    // - byte (8-bit) → Whole numbers (-128 to 127)
// - short (16-bit) → Whole numbers (-32,768 to 32,767)
// - int (32-bit) → Most common integer (-2^31 to 2^31-1)
// - long (64-bit) → Large numbers (-2^63 to 2^63-1), needs 'L' suffix

    public static void main(String[] args) {
        byte age = 25;
        System.out.println(age);

        short number =129;

        long id = 10000000000l;

        int a = 10;
        double b = 5.5;

        boolean result = a>b;
        System.out.println(result);

    }
}
