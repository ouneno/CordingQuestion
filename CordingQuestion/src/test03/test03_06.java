package test03;

import java.util.Scanner;

public class test03_06 {

	// 예제06
	//	첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	//	하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		//	char i = ' ';
		//	char j = '*';
		
		for(int i=N; i>0; i--) {
			System.out.println(" ");
		}
		
	}	
}
