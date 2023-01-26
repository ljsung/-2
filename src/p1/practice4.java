package p1;

import java.util.Scanner;

public class practice4 {
	
//	평가(A, B, C, D, ...)를 문자로 입력 받아 내용을 다르게 출력해보자.
//	switch case문을 사용하여 구현해보자
//
//	평가내용
//	D : slowly~
//	C : run!
//	B : good!!
//	A : best!!!
//	나머지문자들 : what?
//
//	입력
//	영문자 한 개가 입력된다.
//	(A, B, C, D 등의 문자가 입력된다.)
//
//	출력
//	평가내용에 따라 다른 내용이 출력된다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 하나를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		}
		
		
	}

}
