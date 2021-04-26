package assignment_8;

public class Q_8 {

	public static void main(String[] args) {

		fib(6);
	}

	public static void fib(int num) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		if (num > 0) {

			if (num == 1) {
				System.out.println("0");
			} else if (num == 2) {
				System.out.println("1");

			} else {
				for (int i = 3; i <= num - 2; i++) {
					num3 = num1 + num2;
					num2 = num3;
					num1 = num2;
					if (num == i) {

						System.out.println(num3);
					}
				}

			}
		}
	}
}