package edu.java.development;

import java.util.ArrayList;

public class UserService {

    private ArrayList<User> users = new ArrayList<>();

    // регистрация
    public boolean register(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                return false; // уже существует
            }
        }
        users.add(new User(username, password));
        return true;
    }

    // логин
    public User login(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) &&
                    u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }
}
