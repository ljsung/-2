package p1;

import java.util.Scanner;

public class practice14 {

	public static void main(String[] args) {
//		슬기는 지난 번 공던지기에서 져서 아이스크림을 사게되었다.
//
//		얼마 뒤 열받은 슬기는 체육 선생님에게 다시 한번 공던지기를 하여 아이스크림 내기를 하자고 제안하였다.
//
//		그런데 이번에는 불리한 슬기가 다음 룰을 제안하였다.
//
//		1. 공이 30m~40m나 60m~70m 에 들어오면 슬기가 이김.
//		2. 그 외의 구간에 떨어지면 체육선생님이 이김.
//		슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("슬기가 던진 공의 위치>");
		int ball = sc.nextInt();
		
		if((ball<=40&&ball>=30)||(ball<=70&&ball>=60)) {
			System.out.println("Win");
		}else {
			System.out.println("Lose");
			
		}
	}

}
