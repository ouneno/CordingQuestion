package test03;

import java.util.Scanner;

public class test03_05 {
	
	// 예제05
	// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();

		// i는 입력한 숫자까지 1씩 증가
		for (int i=1; i<=N; i++) {	
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
