package assignment_8;

public class Q_16 {

	public static void main(String[] args) {

		System.out.println(simpleRoomBook(true, 7, 8, 2018));

	}

	public static boolean simpleRoomBook(boolean flag, int month, int day, int year) {
		if (flag == true) {
			if (month == 7 && day >= 1 && day <= 8 && year == 2018) {
				return false;
			} else {
				return true;
			}

		}

		else {
			return false;

		}

	}

}
