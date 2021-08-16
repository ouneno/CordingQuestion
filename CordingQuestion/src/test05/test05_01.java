package test05;

import java.util.Scanner;

public class test05_01 {

	// 예제01
	// 최솟값과 최댓값을 찾는 문제
	// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		// 첫번째 : 주어지는 정수의 개수
		int[] arr = new int[sc.nextInt()];
		
		for(int x=0; x<arr.length; x++) {
			arr[x] = sc.nextInt();
		}
		
		int max = 0;
		int min = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			} else if(arr[i] < min) {
				min = arr[i];
			}
		}

	}

}
