package p1;

import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {
//		문제 36
//		1부터 n까지, 1부터 m 까지 숫자가 적힌 색이 서로 다른 주사위 2개를 던졌을 때, 나올 수 있는 모든 경우를 출력해보자.
//
//		입력
//		서로 다른 주사위의 면의 개수 n, m이 입력된다.
//		(단, n, m은 10이하의 자연수)
//
//		출력
//		나올 수 있는 주사위의 숫자가 한 세트씩 줄을 바꿔 모두 출력된다.
//		첫 수는 n, 두번째 수는 m으로 고정해 출력하도록 한다.
	Scanner scan = new Scanner(System.in);
	System.out.print("첫번째 주사위의 숫자를 입력하세요>");
	int n = scan.nextInt();
	System.out.print("두번째 주사위의 숫자를 입력하세요>");
	int m = scan.nextInt();

	for(int i = 1; i<=n; i++) {
		for(int j =1; j<=m; j++) {
			System.out.println(i+" "+j);
		}
	}
		
		
		
		
	}

}
