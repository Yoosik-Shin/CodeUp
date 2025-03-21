package _1503;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] a = new int[N][N];

		int k = 1;
		boolean sw = true;
		// 방법1) 홀수행일 때 정방향, 짝수행일 때 역방향
		// 방법2) 한 번은 정방향, 한 번은 역방향
		// 정방향 : j : 0 1 2 3 4 5 ... N-1
		for (int i = 0; i < a.length; i++) {
			if (sw) {
				for (int j = 0; j < a.length; j++) {
					a[i][j] = k++;
				}
			}

			
			// 역방향 : j : N-1 ... 4 3 2 1 0
			if (!sw) {
				for (int j = N-1; j >= 0; j--) {
					a[i][j] = k++;
				sw = !sw;
				} // 여기랑
			} // 여긴 중괄호 묶으면 왜 동작을 안하지..?!!
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
