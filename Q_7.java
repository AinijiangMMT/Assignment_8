package assignment_8;

public class Q_7 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("655576"));

	}

	public static boolean isPalindrome(String num) {

		String str = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			str = str + num.charAt(i);

		}
		if (str.equals(num)) {
			return true;
		} else {
			return false;
		}

	}
}