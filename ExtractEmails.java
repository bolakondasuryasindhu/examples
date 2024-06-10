import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
public class ExtractEmails {
    public static void main(String[] args) {
        String text = "Here are some email addresses: krishnajitta1@gmail.com, manideepmuthyala@gmail.org, and sandeepkumar@gmail.net.";
        List<String> emails = extractEmailAddresses(text);
        System.out.println("Extracted email addresses: " + emails);
    }
public static List<String> extractEmailAddresses(String text) {
        String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
      Pattern pattern = Pattern.compile(emailPattern);
      Matcher matcher = pattern.matcher(text);
        
        
        List<String> emails = new ArrayList<>();
        
        
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        
        
        return emails;
    }
}
