package assignment_8;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {

		cube(0);

	}

	public static void cube(int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		num = num * num * num;
		System.out.println("output: " + num);

	}
}