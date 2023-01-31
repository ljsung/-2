package p1;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
//		문제 34
//		정수가 순서대로 입력된다.
//		(-2147483648 ~ 2147483647, 단 개수는 알 수 없다.)
//		0이 아니면 입력된 정수를 출력하고
//		0이 입력되면 출력을 중단해보자.
//
//		입력
//		정수가 순서대로 입력된다.
//		(-2147483648 ~ 2147483647, 단 개수는 알 수 없다.)
//
//		출력
//		입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 0을 출력하고 종료한다.

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수를 입력하세요 : ");
			int num = sc.nextInt();
		if(num != 0 ) {
			System.out.println(num);
			continue;
		}else {
			System.out.println("종료");
			break;
		}
		
	}

}
}