public class WrapperClassExample {
    public static void main(String[] args) {
        // Creating a wrapper object using the valueOf() method
        Integer num1 = Integer.valueOf(10);
        Double num2 = Double.valueOf(20.5);
        Character ch = Character.valueOf('A');
        
        // Printing the values of the wrapper objects
        System.out.println("Integer Value: " + num1);
        System.out.println("Double Value: " + num2);
        System.out.println("Character Value: " + ch);
        
        // Converting wrapper objects to primitive data types
        int intValue = num1.intValue();
        double doubleValue = num2.doubleValue();
        char charValue = ch.charValue();
        
        // Printing the primitive data types
        System.out.println("Primitive int value: " + intValue);
        System.out.println("Primitive double value: " + doubleValue);
        System.out.println("Primitive char value: " + charValue);
        
        // Comparing wrapper objects using the compareTo() method
        int compareValue = num1.compareTo(15);
        System.out.println("Compare value: " + compareValue);
        
        // Comparing wrapper objects using the equals() method
        boolean isEqual = num2.equals(20.5);
        System.out.println("Is equal: " + isEqual);
        
        // Converting primitive data type to wrapper object using the valueOf() method
        Integer intWrapper = Integer.valueOf(intValue);
        Double doubleWrapper = Double.valueOf(doubleValue);
        Character charWrapper = Character.valueOf(charValue);
        
        // Printing the wrapper objects
        System.out.println("Integer wrapper: " + intWrapper);
        System.out.println("Double wrapper: " + doubleWrapper);
        System.out.println("Character wrapper: " + charWrapper);
    }
}