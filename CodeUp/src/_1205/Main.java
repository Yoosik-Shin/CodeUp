package _1205;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double plus = a+b;
		
		double minus1 = a-b;
		double minus2 = b-a;
		double multiple = a*b;
		
		double divide1 = a/b;
		double divide2 = b/a;
		double square1 = a*a;
		double square2 = b*b;
		
		double arr[] = new double [8];
		arr[0] = plus;
		
		arr[8] = square2;
		
	}

}
