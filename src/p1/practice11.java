package p1;

import java.util.Scanner;

public class practice11 {

	public static void main(String[] args) {
//		세 정수가 주어지면 그 중 가장 작은 수를 출력한다.
//
//		 
//
//		입력
//
//		세 정수가 주어진다.
//
//		출력
//
//		가장 작은 값을 출력한다.
//
//		 
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int [3];
		for(int i = 0; i<3; i++) {
			System.out.print("숫자를 입력해 주세요>");
			num[i] = scan.nextInt();
		}
		int min = num[0];
		for(int i = 0; i<num.length; i++) {
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println("최소값은? "+min);

	}




}
