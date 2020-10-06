package p0923;

import java.util.Scanner;

public class Exam24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.print("몇 월입니까?:");
		int num1=s1.nextInt();
		switch (num1){
		case(1):
		case(2):
			System.out.println("겨울");
			break;
		case(3):
		case(4):
		case(5):
			System.out.println("봄");
			break;
		case(6):
		case(7):
		case(8):
			System.out.println("여름");
			break;
		case(9):
		case(10):
		case(11):
		case(12):
			System.out.println("겨울");
			break;
		default:
			System.out.println("그런 월은 없습니다.");
		}
	}

}
