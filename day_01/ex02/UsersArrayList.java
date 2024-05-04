// package day_01.ex02;

public class UsersArrayList implements UsersList {
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
	public User retrieve_user_by_ID(int id) throws UserNotFoundException {
		for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                return users[i];
            }
        }
        throw new UserNotFoundException("User with id " + id + " not found");
	}
	public User retrieve_user_by_index(int index) throws UserNotFoundException {
		if (index < count && index >= 0) {
            return users[index];
        }
        throw new UserNotFoundException("User with index " + index + " not found");
	}
	public int retrieve_number_of_users() {
		return (count);
	}

	public void printInfo(){
        for (int i = 0; i < this.count; i++){
            System.out.print(i + "\tName: " + users[i].getName() + "  balance: " + users[i].getBalance());
            System.out.println("\tid: " + users[i].getId());
        }
	}
}