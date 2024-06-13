import java.util.LinkedList;
import java.util.Queue;

public class 큐스택기본구조 {

	public static void main(String[] args) {
       
//		기본 개념
//		1. 큐 생성: LinkedList를 이용하여 큐를 생성합니다.
//		2. 데이터 추가: 큐의 끝에 데이터를 추가합니다.
//		3. 데이터 제거: 큐의 맨 앞에서 데이터를 제거합니다.
//		4. 데이터 확인: 큐의 맨 앞에 있는 데이터를 확인하지만 제거하지 않습니다.
		
		// Queue 생성
        Queue<String> queue = new LinkedList<>();
//        Queue 인터페이스 타입의 변수를 선언하고, LinkedList 객체로 초기화합니다.
//        이제 queue는 LinkedList로 구현된 큐입니다.
        
        // 큐에 데이터 추가
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
//      queue.add("First")는 큐의 끝에 "First"를 추가합니다.
//      add 메소드를 이용해 순서대로 데이터를 추가합니다.
        
        // 큐의 현재 상태 출력
        System.out.println("Queue: " + queue);
        // 큐의 모든 요소를 출력합니다. [First, Second, Third]가 출력됩니다.

        // 큐의 맨 앞 요소 확인 (peek)
        System.out.println("Peek: " + queue.peek());
        // *peek* 메소드는 큐의 맨 앞에 있는 요소를 반환하지만 제거하지 않습니다.
        // "First"가 출력됩니다.
        
        // 큐에서 맨 앞 요소 제거 (poll)
        System.out.println("Poll: " + queue.poll());
        // *poll* 메소드는 큐의 맨 앞에 있는 요소를 제거하고 반환합니다.
        // "First"가 출력되고 큐에서 제거됩니다.
        
        // 큐의 상태 출력
        System.out.println("Queue after poll: " + queue);
        // 요소를 하나 제거한 후 큐의 현재상태를 출력합니다.
        // [Second, Third]가 출력됩니다.
        
        
//        ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        
        /*
         * enqueue X: 정수 X를 큐에 넣는 연산
         * dequeue: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 반환. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 반환(원래는 Exception)
         * size: 큐에 들어있는 정수의 개수를 반환
         * isEmpty: 큐가 비어있으면 true, 아니면 false 반환
         * peek: 큐의 가장 앞에 있는 정수를 반환. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 반환(원래는 Exception)
         */
        
        
        
    }
}
