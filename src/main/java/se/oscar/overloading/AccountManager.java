package se.oscar.overloading;

public class AccountManager {
    public void createAccount(String username) {
        createAccount(username, "1234", null);
    }
    public void createAccount(String username, String password) {
        createAccount(username, password, null);
    }
    public void createAccount(String username, String password, String email) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        if (email != null) {
            System.out.println("Email: " + email);
        }
    }
}
