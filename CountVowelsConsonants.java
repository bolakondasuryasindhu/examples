public class CountVowelsConsonants {
    public static void main(String[] args) {
        String input = "Hello, World!";
        int[] counts = countVowelsAndConsonants(input);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
public static int[] countVowelsAndConsonants(String str) {
        int vowelsCount = 0;
        int consonantsCount = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                vowelsCount++;
            } else if (isConsonant(ch)) {
                consonantsCount++;
            }
        }
return new int[]{vowelsCount, consonantsCount};
    }
public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
 public static boolean isConsonant(char ch) {
        return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
    }
}

