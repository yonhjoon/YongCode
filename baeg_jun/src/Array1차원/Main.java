package Array1차원;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1.
//		/* 정수하나를 입력받아 5이상의 숫자를 입력하였는지 확인하고
//		* 5이상을 입력하였다면 1부터 해당수까지 순차적으로 출력하는 프로그램을 만들어라
//		*/
//		
//		System.out.println("정수하나를 입력하세요 : ");
//		int sum = sc.nextInt();
//		
//		if(sum < 5) {
//			System.out.println("5 이하입니다 다시입력하세요");
//		} else if(sum >= 5){
//			for(int i = 1; i < sum +1; i++) {
//				System.out.print(i+" ");
//			}
//		}
		
		
//		2.
//		/* 정수 n을 입력받아 길이가 n인 1차원배열을 만들어라 
//		* 해당배열에 1~n까지의 수를 차례대로 할당하고 이를 출력하는 프로그램을 작성해라
//		*/
		
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i = 1; i < num.length + 1; i++) {
			System.out.print(i+" ");
		}
		
		
//		3. 우리가 영화관에서 사용하는 프로그램을 만든다고 가정한다.
//		해당 클레스는 영화관 매점에 메뉴 객체를 생성할 Mune Class이다. 
//		필요하다고 생각하는 데이터와 기능을 구현하고 이를 활용해 보자
//		class Menu{
//				//필드
//				//생성자
//				//메소드
//		}
		
		
		
//
//		4. Menu Class이외에 영화관에 필요하다고 생각하는 class를 여러개 구성해보자
//		class Movie {
//		   //필드
//				//생성자
//				//메소드
//		}
//		등등...
	}

}
