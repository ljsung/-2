package p1;

import java.util.Scanner;

public class practice2 {

/*세 정수 a, b, c가 입력되었을 때,
짝 even(짝)/odd(홀)을 출력해보자.
입력
세 정수 a, b, c 가 입력된다.
(0 ~ 2147483647)

출력
순서대로 even(짝)/odd(홀)을 출력한다.

 
입력 예시 
1
2
8

출력 예시
odd
even
even
도움말

if(조건)
{ //코드블럭1 시작
  ... 실행...;
  ...
}
else
{ //코드블럭2 시작
  ... 다른실행...;
  ...
}

*/

	public static void main(String[] args) {
		// 순서대로 even(짝)/odd(홀)을 출력한다.
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int a = scan.nextInt();
		System.out.print("정수를 입력하세요>");
		int b = scan.nextInt();
		System.out.print("정수를 입력하세요>");
		int c = scan.nextInt();
		
		if(a%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		if(b%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		if(c%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}

