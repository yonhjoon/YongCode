package baeg_jun_스터디;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐_10845 {

	public static void main(String[] args) throws IOException {
//		push X: 정수 X를 큐에 넣는 연산이다.
//		pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만
//		     약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 큐에 들어있는 정수의 개수를 출력한다.
//		empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//		front: 큐의 가장 앞에 있는 정수를 출력한다. 
//		//     만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		back: 큐의 가장 뒤에 있는 정수를 출력한다. 
//		     만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

//		특징
//		1.큐의 한쪽 끝은 Front로 정하여 삭제연산만 수행한다.
//		2.다른 한쪽 끝은 Rear로 정하여 삽입연삼나 수행한다.
//		3.그래프 넓이 우선 탐색(BFS)에서 사용된다.
//		4.컴퓨터 버퍼에서 주로 사용, 마구 입력이 되었으나 처리를 하지 못할 때, 버퍼(큐)를 만들어 대기 시킨다. 
//		먼저 들어온 입력먼저 처리
		
//		offer = 넣기
//		poll = 뺴기
//		size = 전체 크기
//		peek = 전체조회 없다면 뭐뭐
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =  Integer.parseInt(br.readLine()); // 길이
		
		StringBuilder sb = new StringBuilder(); 
//		String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존의 데이터에 
//		더하는 방식을 사용하기 때문에 속도도 빠르며 상대적으로 부하가 적다. 
//		즉, 긴 문자열을 더하는 상황에서는 StringBuilder을 사용하면 좋다.
		
		Queue<Integer> q = new LinkedList<Integer>(); // 정수 선언
		int last = 0; //정수
		
		for(int i = 0 ; i < N; i++) { // 입력한만큼 반복하며
			StringTokenizer st = new StringTokenizer(br.readLine());
			//입력받은 값을 문자열 쪼개주고
			//StringTokenizer :문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스
			String command = st.nextToken(); // 입력값의 띄어쓰기도 읽는다
			switch (command) { // 입력에 따라 출력이 다르므로
			case "push":
				last = Integer.parseInt(st.nextToken()); // String를 int로 형 변환
				q.offer(last); //Queue 라이브러리 안에 offer = 추가
				break;
			case "pop" :
				if(q.isEmpty()) sb.append(-1).append("\n"); //isEmpty = 값이있냐없냐
				else sb.append(q.poll()).append("\n"); // 없다면 0 (poll은 값이 있다면 1 없다면 0)
				break;
			case "size" :
				sb.append(q.size()).append("\n"); // 길이출력
				break;
			case "empty" :
				if(q.isEmpty()) sb.append(1).append("\n"); // 값 확인 후 있다면 1
				else sb.append(0).append("\n"); // 없다면 0 하고 행 나눔
				break;
			case "front" :
				if(q.isEmpty()) sb.append(-1).append("\n");// 값 확인 후 있다면 -1
				else sb.append(q.peek()).append("\n"); // 없다면 첫번째 값 나타내줘
				break;
			case "back" :
				if(q.isEmpty()) sb.append(-1).append("\n"); // 값 확인 후 있다면 -1
				else sb.append(last).append("\n"); // 없다면 last 출력
				break;
			}
		}
		System.out.println(sb);
		
		br.close();
	}
}

