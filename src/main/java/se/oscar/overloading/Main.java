package se.oscar.overloading;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        AccountManager accountManager = new AccountManager();

        System.out.println(calc.add(1, 2));
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.add(1.4, 0.7));

        accountManager.createAccount("Oscar");
        accountManager.createAccount("Oscar", "123456789");
        accountManager.createAccount("Oscar", "123456789", "Oscar@gmail.com");
    }
}
