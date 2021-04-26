package assignment_8;

public class Q_15 {

	public static void main(String[] args) {
System.out.println(validateTask(true, 5,3));
	}
public static boolean validateTask(boolean flag, int num2, int num1) {

	if(flag== true && num2==num1+1) {
		return true;
	}else {
		return false;
	}
}
}
