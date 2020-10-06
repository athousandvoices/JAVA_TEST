package p0921;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.print("등급을 입력하세요 : ");
		String sco=s1.next();
		switch (sco){
		case("a"):
			System.out.println("우수 회원입니다.");
			break;
		case("A"):
			System.out.println("우수 회원입니다.");
			break;
		case("b"):
			System.out.println("일반 회원입니다.");
			break;
		case("B"):
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다."); //마지막 default 값에는 break 구문 필요 없음
		}
	}

}
