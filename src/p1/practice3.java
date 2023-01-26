package p1;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
//		문제 31
//
//		점수(정수)를 입력받아 평가를 출력해보자. (0 ~ 100)
//
//		평가기준
//		점수범위 : 평가
//		90 ~ 100 : A
//		70 ~ 89 : B
//		40 ~ 69 : C
//		0 ~ 39 : D
//		로 평가되어야 한다.
//
//		입력
//		정수 한 개가 입력된다.
//		(0 ~ 100)
//
//		출력
//		평가 기준에 따라, 평가가 문자로 출력된다.
//
//		입력 예시 
//		90
//
//		출력 예시
//		A
//		도움말
//		여러 조건들을 순서대로 비교하면서 처리하기 위해서 조건문을 중첩할 수 있다.
//		만약, 순서대로 검사하고 실행하기 위해 아래와 같이 중첩 시킨다면,
//		if(조건1)
//		{
//		 ...
//		}
//		else
//		{
//		    if(조건2)
//		    {
//		    }
//		     else
//		     {

//		    }
//		}

Scanner sc = new Scanner(System.in);
	System.out.println("점수를 입력하세요 :");
	int num = sc.nextInt();
	
	if(num >= 90){
		System.out.println("A");
	}
	else if(num >= 70) {
		System.out.println("B");
	}
	else if(num >= 40) {
		System.out.println("C");
	}
	else {
		System.out.println("D");
	}
		
		
	}

}
