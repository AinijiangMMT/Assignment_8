package assignment_8;

public class Q_17 {

	public static void main(String[] args) {
		boolean available = true;
		boolean gotItAsAGift = true;

		System.out.println(getThunderBlazz(false, false, 5, 2, 3));
	}

	public static boolean getThunderBlazz(boolean b1, boolean b2, int num1, int num2, int num3) {

		if (b1 == true || b2 == true) {
			return true;
		} else if (b1 == false && b2 == false) {
			if (num1 == 3 && num2 == 2 && num3 == 2) {
				return true;
			
		} else if (num1 == 1 && num2 == 2 && num3 == 3) {
			return true;
		} else {
			return false;
		}
	}return false;
	}
}
