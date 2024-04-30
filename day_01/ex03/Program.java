package day01.ex03;

public class Program {
    public static void main(String[] args) {
        User[] users = new User[26];
        for (int i = 0; i < 25; i++) {
            users[i] = new User(("User" + (i + 1)), (i * 1000));
            System.out.println(users[i]);
        }
    }
}
