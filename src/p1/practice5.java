package p1;

import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
//		문제 33
//
//		월을 나타내는 정수 한개(1~12)가 입력될 때 계절이 출력되도록 해보자.
//		예
//		월 : 계절
//		12, 1, 2 : winter
//		3, 4, 5 : spring
//		6, 7, 8 : summer
//		9, 10, 11 : fall
//
//		입력
//		월을 의미하는 한 개의 정수가 입력된다.
//		(1 ~ 12)
//
//		출력
//		계절을 출력한다.	 
//
//		입력 예시 
//		12

//		출력 예시
//		winter

//		도움말
//		swtich( ).. case ... break; 제어문에서 break;를 제거하면
//		멈추지 않고 다음 명령이 실행되는 특성을 이용할 수 있다.
//
//		switch(a)
//		{
//		   ...
//		   case 3:
//		   case 4:
//		   case 5:
//		    printf("spring");
//		   break;
//		   ...
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 달을 입력하세요:");
		int month = sc.nextInt();
		switch(month) {
		
		case 1:
		case 12:
		case 2:
			System.out.println("winter");
		break;
		
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
		break;
		
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
		break;
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
	    break;
		}
		
		
	}

}
