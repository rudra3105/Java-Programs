public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a String object
        String str1 = "Hello";
        
        // Creating a StringBuffer object
        StringBuffer str2 = new StringBuffer("World");
        
        // Concatenating the two strings
        str2.append(str1);
        
        // Printing the concatenated string
        System.out.println("Concatenated String: " + str2);
        
        // Inserting a string at a specific position
        str2.insert(5, " ");
        
        // Printing the modified string
        System.out.println("Modified String: " + str2);
        
        // Replacing a substring
        str2.replace(5, 6, ",");
        
        // Printing the modified string
        System.out.println("Modified String: " + str2);
        
        // Reversing the string
        str2.reverse();
        
        // Printing the reversed string
        System.out.println("Reversed String: " + str2);
        
        // Deleting a substring
        str2.delete(5, 11);
        
        // Printing the modified string
        System.out.println("Modified String: " + str2);
        
        // Converting StringBuffer to String
        String finalString = str2.toString();
        
        // Printing the final string
        System.out.println("Final String: " + finalString);
    }
}