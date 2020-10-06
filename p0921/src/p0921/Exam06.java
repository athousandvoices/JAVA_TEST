package p0921;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.print("등급을 입력하세요 : ");
		String sco=s1.next();
		switch (sco){
		case("A"):
			System.out.println("VVIP 혜택을 받으실 수 있습니다.");
			break;
		case("B"):
			System.out.println("VIP 혜택을 받으실 수 있습니다.");
			break;
		case("C"):
			System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
			break;
		case("D"):
			System.out.println("일반 회원 혜택을 받으실 수 있습니다.");
			break;
		default:
			System.out.println("혜택이 없습니다."); //마지막 default 값에는 break 구문 필요 없음
		}
	}

}
