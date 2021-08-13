package test02;

import java.util.Scanner;

public class test02_04 {
	
	// 예제04
	//	점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 
	//	단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a>0 && b>0) {
			System.out.println("Quadrant 1");
		} else if (a<0 && b>0) {
			System.out.println("Quadrant 2");
		} else if (a<0 && b<0) {
			System.out.println("Quadrant 3");
		} else if (a>0 && b<0) {
			System.out.println("Quadrant 4");
		}
	}

}
