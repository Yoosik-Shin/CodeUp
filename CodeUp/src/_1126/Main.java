package _1126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int plus = a + b;
		int minus = a - b;
		int multiple = a * b;
		int divide = a / b;
		int remain = a % b;

		System.out.println(a + " + " + b + " = " + plus);
		System.out.println(a + " - " + b + " = " + minus);
		System.out.println(a + " * " + b + " = " + multiple);
		System.out.println(a + " / " + b + " = " + divide);
		System.out.println(a + " % " + b + " = " + remain);

		sc.close();
	}

}
