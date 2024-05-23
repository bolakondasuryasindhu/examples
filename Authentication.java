import java.util.HashMap;
import java.util.Map;

class User {
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String pin;

    public User(String username, String password, String email, String phoneNumber, String pin) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPin() {
        return pin;
    }
}

class UserManager {
    private Map<String, User> usersByUsername = new HashMap<>();
    private Map<String, User> usersByEmail = new HashMap<>();
    private Map<String, User> usersByPhoneNumber = new HashMap<>();

    public void addUser(User user) {
        usersByUsername.put(user.getUsername(), user);
        usersByEmail.put(user.getEmail(), user);
        usersByPhoneNumber.put(user.getPhoneNumber(), user);
    }

    public boolean authenticate(String username, String password) {
        User user = usersByUsername.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public boolean authenticateByEmail(String email, String password) {
        User user = usersByEmail.get(email);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public boolean authenticateByPhoneNumber(String phoneNumber, String pin) {
        User user = usersByPhoneNumber.get(phoneNumber);
        if (user != null && user.getPin().equals(pin)) {
            return true;
        }
        return false;
    }
    
    // Overloaded methods for different combinations of parameters
    public boolean authenticate(String email, String phoneNumber, String pin) {
        User user = usersByPhoneNumber.get(phoneNumber);
        if (user != null && user.getEmail().equals(email) && user.getPin().equals(pin)) {
            return true;
        }
        return false;
    }
}

public class Authentication{
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        
        // Adding a user
        User user = new User("john_doe", "password123", "john.doe@example.com", "1234567890", "4321");
        userManager.addUser(user);
        
        // Authenticating using different methods
        System.out.println(userManager.authenticate("john_doe", "password123")); // true
        System.out.println(userManager.authenticateByEmail("john.doe@example.com", "password123")); // true
        System.out.println(userManager.authenticateByPhoneNumber("1234567890", "4321")); // true
        System.out.println(userManager.authenticate("john.doe@example.com", "1234567890", "4321")); // true
    }
}
