package day_01.ex00;

public class User {
	private String name;
	private int balance; 
	final int id;

	public User(String name, int id, int balance) {
		this.name = name;
		this.id = id;
		if (balance >= 0) {
			this.balance = balance;
		} else {
			this.balance = 0;
		}
	}
	
	public void setBalance(Integer balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

	public int getBalance() {
        return balance;
    }

	public String getName() {
		return name;
	}

	public int getId() {
        return id;
    }

	public String toString() {
        return "User info: " +
		"\nName = " + name + 
		"\nId = " + id + 
		"\nBalance = " + balance +
		"\n";
    }
}

