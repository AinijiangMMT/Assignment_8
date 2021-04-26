package assignment_8;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {

		plus(0, 0);

	}

	public static void plus(int num1, int num2) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		num1 = sc.nextInt();

		System.out.println("enter second number:");
		num2 = sc.nextInt();

		System.out.println("result: " + (num1 + num2));

	}

}