package test03;

import java.util.Scanner;

public class test03_04 {

	// 예제04
	// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		
		for(int i=N; i>0; i--) {
			System.out.println(i);
		}

	}

}
