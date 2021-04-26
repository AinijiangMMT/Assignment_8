package assignment_8;

public class Q_11 {

	public static void main(String[] args) {

	System.out.println(c_profit(250,250));	
		
	}
public static String c_profit(int buyPrice, int sellPrice) {
	if(sellPrice>buyPrice) {
		return "profit";
		
	}else if(sellPrice==buyPrice) {
		return "no loss";
		
	}else {
		return "loss";
	}
}
}
