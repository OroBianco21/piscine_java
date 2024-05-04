// package day_01.ex02;

public interface UsersList {
	void add_users_List(User add_user);
	User retrieve_user_by_ID(int id) throws UserNotFoundException;
	User retrieve_user_by_index(int index) throws UserNotFoundException;
	int retrieve_number_of_users();
}
