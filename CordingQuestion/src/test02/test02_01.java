package test02;

import java.util.Scanner;

public class test02_01 {
	
	// 예제01
	//	첫째 줄에 다음 세 가지 중 하나를 출력한다.
	//
	//	A가 B보다 큰 경우에는 '>'를 출력한다.
	//	A가 B보다 작은 경우에는 '<'를 출력한다.
	//	A와 B가 같은 경우에는 '=='를 출력한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a>b) {
			System.out.println(">");
		} else if (a<b) {
			System.out.println("<");
		} else if (a==b) {
			System.out.println("==");
		}
	}

}
