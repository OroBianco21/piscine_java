package day_01.ex00;

public class Program {
	public static void main(String[] args) {
		User user1 = new User("Paulo", 23, 5000);
		System.out.println(user1);
		User user2 = new User("Franco", 24, 450);
		System.out.println(user2);

		Transaction trans1 = new Transaction(user1, user2, 550, Transaction.Category.CREDIT);
        System.out.println(trans1);
        Transaction trans2 = new Transaction(user1, user2, -500, Transaction.Category.CREDIT);
        System.out.println(trans2);
        Transaction trans3 = new Transaction(user1, user2, 250, Transaction.Category.CREDIT);
        System.out.println(trans3);
        Transaction trans4 = new Transaction(user1, user2, 250, Transaction.Category.DEBIT);
        System.out.println(trans4);
	}
}
