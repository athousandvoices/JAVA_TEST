package p0924;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num=0;
		while(num!=4){ //=아닌 != 연산자 사용
			System.out.println("손님 주문하시겠습니까 ? ");
			System.out.print("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬래요 ==> ");
			num=s1.nextInt();
			switch(num){
			case(1):
				System.out.println("#카페라떼 주문하셨습니다.");
				break;
			case(2):
				System.out.println("#카푸치노 주문하셨습니다.");
				break;
			case(3):
				System.out.println("#아메리카노 주문하셨습니다.");
				break;
			}
		}
		System.out.println("주문하신 커피 준비하겠습니다.");
	}

}
