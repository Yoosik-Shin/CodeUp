package _1205;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double plus1 = a+b;
		double plus2 = b+a;
		double minus1 = a-b;
		double minus2 = b-a;
		double multiple1 = a*b;
		double multiple2 = b*a;
		double divide1 = a/b;
		double divide2 = b/a;
		double square1 = a*a;
		double square2 = b*b;
		
		double arr[] = new double [10];
		arr[0] = plus1;
		
		arr[10] = square2;
		
	}

}
