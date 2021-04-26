package assignment_8;

public class Q_14 {

	public static void main(String[] args) {
System.out.println(threeLocks(false, false,false));
	}
public static boolean threeLocks(boolean b1, boolean b2,boolean b3) {
	if(b1==true || b2==true || b3==true) {
		return true;
	}else {
		return false;
	}
}
}
