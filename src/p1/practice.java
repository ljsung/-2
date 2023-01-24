package p1;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		/*	정수 두 개(a, b)를 입력받아 (0 <= a, b <= 10)
		a에 2b를 곱하는 프로그램을 작성해보자.
		k = a * 2b; 과 같다. 
		입력
		정수 두 개가 입력된다.
		(0 <= a , b <= 10)

		출력
		a에 2b를 곱하여 출력한다.	 
		입력 예시 
		1
		3
		출력 예시
		8
		도움말
		예를 들어 1, 3 이 입력되면, 1을 2^3(8)배 하여 출력한다.
		Math.pow(a, b) 함수를 이용하면, a^b승의 결과값을 반환한다.정수 두 개(a, b)를 입력받아 (0 <= a, b <= 10)
		a에 2b를 곱하는 프로그램을 작성해보자.
		k = a * 2b; 과 같다.
		입력
		정수 두 개가 입력된다.
		(0 <= a , b <= 10)
		출력
		a에 2b를 곱하여 출력한다.
		입력 예시 
		1
		3
		출력 예시
		8
		도움말
		예를 들어 1, 3 이 입력되면, 1을 2^3(8)배 하여 출력한다.

		Math.pow(a, b) 함수를 이용하면, a^b승의 결과값을 반환한다. */
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수 입력>");
		int a = scan.nextInt();
		if(0<=a) {
			System.out.print("10보다 작은 정수 입력 : ");
			int b = scan.nextInt();
			if(b<=10) {
				double multi = a*Math.pow(2, b);	//Math.pow()함수는 base의 exponent 곱, 즉 base^exponent를 반환합니다. base와 exponent는 10진수입니다.
				System.out.println(multi);
			}else {
				System.out.println("다시 입력해 주세요.");
			}
		}else {
			System.out.println("다시 입력해 주세요.");
		}
	}

}