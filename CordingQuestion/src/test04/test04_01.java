package test04;

import java.util.Scanner;

public class test04_01 {

	public static void main(String[] args) {
		
		// 예제01
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
						
			if(A==0 && B==0) {
				sc.close();
				break;
			}
			System.out.println(A+B);
			
		}
	}

}
