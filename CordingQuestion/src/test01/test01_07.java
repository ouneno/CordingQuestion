package test01;

import java.util.Scanner;

public class test01_07 {
	
	// 예제07
	// 두 자연수 A와 B가 주어진다. 
	// 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

	}

}
