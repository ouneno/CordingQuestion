package test01;

import java.util.Scanner;

public class test01_05 {
	
	// ex05
	// 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a * b);
	}

}
