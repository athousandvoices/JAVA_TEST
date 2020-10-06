package p0924;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int use, left;

		left=10000;
		do {
			System.out.println("교통카드 잔액 : "+left);
			System.out.print("사용할 금액을 입력하세요 : ");
			use=s1.nextInt();
			left=left-use;			
		}while(left>0);
		System.out.println("잔액이 부족해 교통카드를 사용할 수 없습니다.");
	}

}
