package Array1차원;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//길이 배열
		int count = 0; // 총 수
		int N = sc.nextInt(); //길이 입력
		int[] arr = new int[N]; // N길이의 배열
		
		// 배열안에 값 입력
		for(int i =0; i<N; i++) {
			arr[i] = sc.nextInt(); // 배열안에 값 입력
		}
		// 배열안에 원하는 값 입력 후 true = count++
		for(int i = 0; i < arr.length; i++) {
			int V = sc.nextInt(); // 원하는 정수
			if(arr[i] == V) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
