public class FindCharacterIndex {
    public static void main(String[] args) {
        // Define the string to be searched
        String str = "Banana";

        // Define the character to find
        char ch = 'a';

        // Find the index of the first occurrence of the character
        int index = str.indexOf(ch);

        // Output the result
        if (index != -1) {
            System.out.println("The first occurrence of the character '" + ch + "' is at index: " + index);
        } else {
            System.out.println("The character '" + ch + "' is not found in the string.");
        }
    }
}
