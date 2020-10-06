package p0924;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int use, left;
		for(left=10000; left>0;){
			System.out.println("교통카드 잔액 : "+left);
			System.out.print("사용할 금액을 입력하세요 : ");
			use=s1.nextInt();
			left=left-use;
		}
		System.out.println("잔액이 부족해 교통카드를 사용할 수 없습니다.");
	}

}
/*
 * for (1.초기화식; 2.조건식; 4.증감식){
 * 3.실행 문장;   ---->   조건식이 참이면 4 증감식 반복
 * }
 * ----> 조건식이 거짓이면 for문 종료.
 * */
