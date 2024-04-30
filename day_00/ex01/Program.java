import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner myNum = new Scanner(System.in);
		int number = myNum.nextInt();
		int step = 1;
		boolean prime = true;

		if (number <= 1) {
			System.out.println("IllegalArgument");
			System.exit(-1);
		} else if (number == 2) {
				prime = true;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					prime = false;
					break ;
				}
				step++;
				prime = true;
			}
		}
			if (prime) {
				System.out.println("True " + step);
		} else {
			System.out.println("False " + step);
		}
			myNum.close();
	}
}