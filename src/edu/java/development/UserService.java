package edu.java.development;

public class UserService {

    public User register(String username, String password) {
        return new User(username, password);
    }

    public boolean login(User user, String username, String password) {
        return user.getUsername().equals(username);
    }
}
