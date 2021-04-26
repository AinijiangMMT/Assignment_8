package assignment_8;

public class Q_13 {

	public static void main(String[] args) {

		System.out.println(waterTax(101));
		
		
	}
public static double waterTax(double num) {
	if(num<=50) {
		return num*0.60;
	}else if(num>50 && num<=100) {
		return num*0.90;
	}else if(num>100 && num<=150){
		return num*0.90+50;
	}else {
		return num*0.90+100;
	}
}
}
