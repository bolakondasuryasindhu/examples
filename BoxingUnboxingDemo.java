public class BoxingUnboxingDemo {
    public static void main(String[] args) {
        // Boolean
        boolean boolPrimitive = true;
        Boolean boolObject = boolPrimitive;  // Boxing
        boolean boolUnboxed = boolObject;    // Unboxing

        System.out.println("Boolean: Primitive = " + boolPrimitive + ", Object = " + boolObject + ", Unboxed = " + boolUnboxed);

        // Byte
        byte bytePrimitive = 10;
        Byte byteObject = bytePrimitive;  // Boxing
        byte byteUnboxed = byteObject;    // Unboxing

        System.out.println("Byte: Primitive = " + bytePrimitive + ", Object = " + byteObject + ", Unboxed = " + byteUnboxed);

        // Character
        char charPrimitive = 'a';
        Character charObject = charPrimitive;  // Boxing
        char charUnboxed = charObject;    // Unboxing

        System.out.println("Character: Primitive = " + charPrimitive + ", Object = " + charObject + ", Unboxed = " + charUnboxed);

        // Short
        short shortPrimitive = 20;
        Short shortObject = shortPrimitive;  // Boxing
        short shortUnboxed = shortObject;    // Unboxing

        System.out.println("Short: Primitive = " + shortPrimitive + ", Object = " + shortObject + ", Unboxed = " + shortUnboxed);

        // Integer
        int intPrimitive = 30;
        Integer intObject = intPrimitive;  // Boxing
        int intUnboxed = intObject;    // Unboxing

        System.out.println("Integer: Primitive = " + intPrimitive + ", Object = " + intObject + ", Unboxed = " + intUnboxed);

        // Long
        long longPrimitive = 40L;
        Long longObject = longPrimitive;  // Boxing
        long longUnboxed = longObject;    // Unboxing

        System.out.println("Long: Primitive = " + longPrimitive + ", Object = " + longObject + ", Unboxed = " + longUnboxed);

        // Float
        float floatPrimitive = 50.0f;
        Float floatObject = floatPrimitive;  // Boxing
        float floatUnboxed = floatObject;    // Unboxing

        System.out.println("Float: Primitive = " + floatPrimitive + ", Object = " + floatObject + ", Unboxed = " + floatUnboxed);

        // Double
        double doublePrimitive = 60.0;
        Double doubleObject = doublePrimitive;  // Boxing
        double doubleUnboxed = doubleObject;    // Unboxing

        System.out.println("Double: Primitive = " + doublePrimitive + ", Object = " + doubleObject + ", Unboxed = " + doubleUnboxed);
    }
}

