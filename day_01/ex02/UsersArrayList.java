// package day_01.ex02;

public class UsersArrayList {
	private int size = 10;
	private int tmp_size = 0;
	private int count = 0;
	private double tmp = 0;
	private User[] users = new User[size];

	public void add_users_List(User add_user) {
		if (size == count) {
			tmp = size * 0.5;
			size = (int) tmp;
			User[] new_users = new User[size];
			for (int i = 0; tmp_size <= size; tmp_size++) {
				new_users[i] = users[i];
			}
			tmp_size = size;
			users = new_users;
			users[count++] = add_user;
		} else {
			users[count++] = add_user;
		}
	}
	int retrieve_user_by_ID() {

	}
	int retrieve_user_by_index() {

	}
	int retrieve_number_of_users() {
		
	}
}