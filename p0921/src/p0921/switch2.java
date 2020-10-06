package p0921;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("학년을 입력하세요 : ");
		int num1=s1.nextInt();
		switch (num1){
		case(10):
		case(9):
			System.out.println("A학점");
			break;
		case(8):
			System.out.println("B학점");
			break;
		case(7):
			System.out.println("C학점");
			break;
		case(6):
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점"); //마지막 default 값에는 break 구문 필요 없음
		}
	}

}
