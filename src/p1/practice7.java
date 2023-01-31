package p1;

import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {
		
//		정수 한 개를 입력받아 1 부터 그 수까지 짝수의 합을 구해보자.
//
//		입력
//		정수 한 개가 입력된다.
//		(0 ~ 100)
//
//		출력
//		1부터 입력된 수까지 짝수의 합을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0; i <= num ; i++) {
			if(i % 2 == 0) {
				sum += i;
				System.out.println(i+" ");
			}
		}
		System.out.println();
		System.out.println("입력한 숫자는 1부터 " + num + "까지의 짝수의 수를 더한 수는" + sum + "입니다.");
	}

}
