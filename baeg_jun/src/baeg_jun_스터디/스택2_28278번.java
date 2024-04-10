package baeg_jun_스터디;

import java.util.Scanner;

public class 스택2_28278번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 길이
		int[] num = new int[N];
		
		
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		
		int min = num[0];
		for(int i = 0; i < N; i ++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		int max = num[0];
		for(int i = 0; i < N; i ++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(min + " " +max);

	}

}
