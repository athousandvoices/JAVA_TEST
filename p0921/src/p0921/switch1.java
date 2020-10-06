package p0921;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("학년을 입력하세요 : ");
		int num1=s1.nextInt();
		switch (num1){
		case(1): //case 내부의 값은 입력된 num1에 해당
			System.out.println("1학년");
			break;
		case(2):
			System.out.println("2학년");
			break;
		case(3):
			System.out.println("3학년");
			break;
		case(4):
			System.out.println("4학년");
			break;
		case(5):
			System.out.println("5학년");
			break;
		case(6):
			System.out.println("6학년");
			break;
		default:
			System.out.println("해당 학년이 없습니다."); //마지막 default 값에는 break 구문 필요 없음
		}
	}

}
