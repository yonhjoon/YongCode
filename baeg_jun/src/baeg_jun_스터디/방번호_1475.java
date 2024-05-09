package baeg_jun_스터디;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 방번호_1475 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		int[] set = new int[9]; // 9개의 세트
		
		// 커버가능한 세트의 숫자를 출력해라
		// 6과 9는 뒤집어서 사용할수있다 즉 6 혹은 9 를 더 사용할수있다.
		// 0 ~ 9까지의 숫자가있고
		// 한세트에 숫자 1개만 들어있다.
		// 즉 123 다 들어있으니 1세트로 충분
		// 1223 은 2가 2개있으니 2세트
	   // 변수이름    설명         결과
		// arr => 세트안에 숫자 => 0~9
		// num => 내가 필요한 수 => 예 ) num => 125
		// sum => 필요한세트 수 => 124 -> sum =>1세트
		
		String s = br.readLine(); // 방 번호 입력받기

        int[] count = new int[10]; // 각 숫자의 개수를 저장할 배열

        // 숫자 개수 세기
        for (int i = 0; i < s.length(); i++) {
            int num = Character.getNumericValue(s.charAt(i));
            if (num == 6 || num == 9) { // 숫자가 6 또는 9인 경우
                if (count[6] <= count[9]) { // 둘 중 더 적은 숫자의 개수를 증가시킴
                    count[6]++;
                } else {
                    count[9]++;
                }
            } else {
                count[num]++;
            }
        }

        // 필요한 세트의 최솟값 계산
        int max = 0;
        for (int i = 0; i < 10; i++) {
            max = Math.max(max, count[i]);
        }

        System.out.println(max); // 결과 출력
		
		//반복문을 통해 
//		int num = Integer.parseInt(br.readLine());
//		
//		for(int i = 0; i < 9; i++) {
//			if(set[i] == 9) {
//				set[i] = 6;
//				set[6]++;
//			}
//			
//		}
//		bw.write(set[0]);
		
		
		
//		String s = br.readLine(); // 스트링으로 받는다 왜 스트링으로 받느냐 charAt라 상관없음
//		int[] arr = new int[10]; //arr 이라는 10개의 값이 있는 배열 생성
//		for (int i = 0; i < s.length(); i++) { //  s 의 길이만큼 반복 왜? 내가 입력한 숫자의 길이만큼 이니깐
//		    int num = Character.getNumericValue(s.charAt(i)); 
//		    // num에 i값을 charAt형식으로 넣는다
//		    if (num == 6) { // 이 반복문 안에서 만약 num이 6 이라면
//		        arr[9]++; // arr배열안에 9 플러스 왜? 6은 9가될수있고 9는 6이 될수있으니깐
//		                    //                어찌됬든 6을쓰고 6이필요해 9를쓰면  6,9 다 쓰는거라서
//		    } else { //그게 아니면
//		        arr[num]++; // arr배열안에 num 플러스 같은숫자로 할수있는게없으니 무조건 한개의 세트가 더 필요하다
//		    }
//		}
//		int max = 0; //세트 갯수
//		for (int i = 0; i < 9; i++) { // 0~9까지 반복하며
//		    max = Math.max(max,arr[i]); // max안에 가장 큰수를 저장할거다
//		  // 0              0  (0~9)
//		}
//		int nine = arr[9]/2; // nine는 arr[9]를 2로 나눈다
//		if (arr[9]%2==1) nine++; // 만약 arr[9] /2 했을때 값이 1 이라면 nine플러스
//		max = Math.max(max,nine); // max안에 넣는다
//		System.out.print(max); // 출력
		
		
//		String s = br.readLine(); // 사용자로부터 문자열을 입력받음. 이 때, 문자열은 다솜이의 방 번호를 나타냄
//		int[] arr = new int[10]; // 0부터 9까지의 숫자 개수를 저장하기 위한 배열을 생성함
//		for (int i = 0; i < s.length(); i++) { // 입력된 문자열의 길이만큼 반복문을 실행
//		    int num = Character.getNumericValue(s.charAt(i)); // 문자열에서 i번째 문자를 숫자로 변환하여 num 변수에 저장
//		    if (num == 6) { // 만약 숫자가 6이라면
//		        arr[9]++; // 배열의 9번 인덱스(실제로는 숫자 9를 의미)에 해당하는 값을 증가시킴. 여기서는 6과 9를 동일하게 취급하기 위함
//		    } else { // 그 외의 경우(숫자가 6이 아닌 경우)
//		        arr[num]++; // 해당하는 숫자의 인덱스에 해당하는 값을 증가시킴. 숫자 0부터 8까지는 해당하는 인덱스에 직접 값을 증가시킴
//		    }
//		}
//		int max = 0; // 세트의 최대 개수를 저장할 변수를 초기화함
//		for (int i = 0; i < 9; i++) { // 0부터 8까지의 인덱스를 반복하면서
//		    max = Math.max(max,arr[i]); // 배열의 각 숫자 개수 중 최댓값을 구해서 max 변수에 저장함
//		}
//		int nine = arr[9]/2; // 배열의 9번 인덱스(실제로는 숫자 9를 의미)에 해당하는 값을 2로 나눈 몫을 구함
//		if (arr[9]%2==1) nine++; // 만약 9를 이용한 세트가 홀수 개라면 1을 더함(올림 처리)
//		max = Math.max(max,nine); // 배열의 6과 9를 함께 사용한 경우와 그 외의 숫자를 사용한 경우 중 더 큰 값을 max에 저장함
//		System.out.print(max); // 최종적으로 필요한 세트의 최댓값을 출력함
		

	}
}

