import java.util.Objects;

public class Player {
    private String userId;
    private String username;
    private String email;
    private String passwordHash;
    private Statistics statistics;

    public Player(String userId, String username, String email, String passwordHash) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
        this.statistics = new Statistics();
    }

    public boolean register(String email, String password) {
        // Simulate registration logic
        this.email = email;
        this.passwordHash = hashPassword(password);
        System.out.println("User registered: " + email);
        return true;
    }

    public Boolean login(String email, String password) {
        if (Objects.equals(this.email, email) && Objects.equals(this.passwordHash, hashPassword(password))) {
            System.out.println("Login successful for: " + email);
            return true;
        }
        System.out.println("Login failed for: " + email);
        return false;
    }

    public void logout() {
        System.out.println("User logged out: " + email);
    }

    private String hashPassword(String password) {
        return Integer.toString(password.hashCode()); // Simplified hashing
    }
}

class Statistics {
    // Track player statistics like wins, losses, etc.
}
