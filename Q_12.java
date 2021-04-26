package assignment_8;

public class Q_12 {

	public static void main(String[] args) {

		System.out.println(hamletQuote(false, false));

	}

	public static boolean hamletQuote(boolean b1, boolean b2) {
		if (b1 == true || b2 == true) {
			return true;
		} else {
			return false;
		}
	}
}
