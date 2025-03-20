package _1295;

import java.util.Scanner;

public class Main {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        char[] arr = a.toCharArray(); // 입력받은 문자열을 한글자씩 char배열로 전환
	        System.out.println(arr);
	        for (int i = 0; i < arr.length; i++) {
	        	// int arr[] = new int[10];
	        	// int num = arr;  <- ??? 일단 안되는것
	        	char ar = arr[i]; // 배열에서 하나씩 변수에 입력
	        	if (Character.isLowerCase(ar)) {
	        		arr[i] = Character.toUpperCase(ar);
	        	} else {
	        		arr[i] = Character.toLowerCase(ar);
	        	}
			}
	        for (char c : arr) {
	        	System.out.print(c);
	        }
	        sc.close();
	    }
	
}
