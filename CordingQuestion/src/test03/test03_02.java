package test03;

import java.util.Scanner;

public class test03_02 {

	// 예제02
	// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0;
		n = sc.nextInt();
				
		for (int i=1; i<=n; i++) {
			sum = sum+i;
		}
		System.out.println(sum);

	}

}
