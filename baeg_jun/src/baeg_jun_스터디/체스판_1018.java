package baeg_jun_스터디;

import java.util.Scanner;

public class 체스판_1018 {

	public static void main(String[] args) {
		
		// MxN 크기의 보드
		// 어떤곳은 검은색 어떤곳은 흰색
		// 8x8로 만들려고한다.
		// 검흰검흰 번갈아가면서 칠해져있다
		// 각칸의 검은색으로 시작하면 다음은 흰색
		// 흰색으로 시작하면 다음이 검은색으로
		// 여기서 문제는 검 검 검 흰 이라 했을때
		// 검 흰 검 흰 으로 검을 흰으로 다시 칠해줘야한다.
		// 이떄 칸 안에서 내가 몇개를 다시 칠해야될까? 를 구한다.
		
		// 입력값 int N(행) , int M(열)
		// N & M >=8 || N & M <= 50
		// B = black  W = white
		
		// 첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 행 (가로)
		int M = sc.nextInt(); // 열 (세로)
		int count = 0; // 최소값
		
		for(int i = 0; i < N; i++) { //행만큼 반복
			for(int j = 0; j < M; j++) { // 열만큼 반복
				sc.next(); // 입력
				
				count += 1; //최소값 + 1
			}
			System.out.print(count);
		}

	}

}
