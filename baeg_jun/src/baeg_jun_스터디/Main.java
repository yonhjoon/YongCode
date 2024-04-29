package baeg_jun_스터디;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 주어진 숫자
		int M = sc.nextInt(); // 최대 숫자
		int B = 0; // 3개 수의 합
		int C = 0; // 가장 가까운 수
		
		int[] sum = new int[N]; // N길이의 배열
		
		for(int i = 0; i < N; i++) {
			sum[i] = sc.nextInt(); // N의 길이만큼 숫자 입력
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					 B = (sum[i]+sum[j]+ sum[k]); // 모든 값을 더한
					 if(B < M && B > C) { // B:3수합 이 M:최대숫자 보다 작으면서  B:3수합 보다 C:가장가까운 수 작으면
						 C = B;
					 }
				}
			}
		}
		System.out.println(C);
	}
}
