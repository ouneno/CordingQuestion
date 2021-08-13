package test01;

import java.util.Scanner;

public class test01_03 {
	
	// ex03 
	// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println(a+b);
	}

}
