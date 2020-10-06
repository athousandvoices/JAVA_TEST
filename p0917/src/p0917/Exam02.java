package p0917;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double num1;
		Scanner S1=new Scanner(System.in);
		
		System.out.print("평점을 입력하세요 : ");
		num1=S1.nextDouble();
		if(num1>=4.0){
			System.out.println("평점 : "+num1); //참일 경우에만 실행됨.
			System.out.println("장학금 대상자입니다.");
		}else{
			System.out.println("평점 : "+num1); //거짓일 경우에만 실행됨.
			System.out.println("장학금 대상자가 아닙니다.");
		}
	}

}
