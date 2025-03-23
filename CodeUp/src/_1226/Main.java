package _1226;

import java.util.Iterator;
import java.util.Scanner;


/**
 * 7칸 배열과 6칸 배열을 만들어서
 * 7칸 배열에는 당첨숫자와 보너스 숫자 입력받고
 * 6칸 배열에는 내가 고른 숫자 6개 입력받아서
 * 
 * 두개의 배열을 비교한다.
 *  - 당첨 배열의 0번 인덱스 + 내숫자 배열 0~5까지 비교
 *  - 당첨 배열의 1번 인덱스 + 내숫자 배열 0~5까지 비교
 *   ... 당첨배열의 6번 인덱스까지 다 비교 아마도 for문 안의 for문으로.. 하면될듯?
 *   
 * 비교하는 와중 당첨배열과 내배열의 같은 숫자가 있다면 (if문)
 * count 변수 하나 만들어서 카운트 시킴
 * 
 * 해서 카운트된 횟수대로 1~6등까지 매기면 될거같은데...
 * 보너스번호는 어떻게 한담..?
 *   
 *  
 */



public class Main {

	public static void main(String[] args) {
		int goal[] = new int[7];
		int myNum[] = new int[6];
		Scanner sc = new Scanner(System.in);
		
		
		// 당첨번호 입력
		for (int i = 0; i < goal.length; i++) {
			goal[i] = sc.nextInt();
		}
		// 당첨번호 출력 test
		for (int i = 0; i < goal.length; i++) {
			System.out.print(goal[i] + " ");
		}
		System.out.println();
		
				
		// 내 번호 입력
		for (int i = 0; i < myNum.length; i++) {
			myNum[i] = sc.nextInt();
		}
		// 내 번호 출력 test
		for (int i = 0; i < myNum.length; i++) {
			System.out.print(myNum[i] + " ");
		}
		
		
		// 당첨번호와 내 번호 비교
		int count = 0;
		int bonus = 0;

		for (int i = 0; i < goal.length; i++) {
			for (int j = 0; j < myNum.length; j++) {
				
				if (goal[i] == myNum[j]) count++;
				if (goal[6] == myNum[j]) bonus++; count--;				
			}
		}
		if (count <= 2) {System.out.println("0");  } 
		
		else if (count == 3) {System.out.println("5");  } 
		
		else if (count == 4) {System.out.println("4");  } 
		
//		else if(count == 5 && goal[6] != myNum[j]) {System.out.println("3"); return;} 
		
//		else if (count == 5 && goal[6] == myNum[j]) {System.out.println("2"); return;} 
		
//		else if (count == 6 && goal[6] != myNum[j]) {System.out.println("1"); return;}
		

	
		
		
		sc.close();
	}
	
}
