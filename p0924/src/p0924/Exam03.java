package p0924;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2=0, num3=100000; //1회 요금, 누적 요금, 목표 요금
		Scanner s1=new Scanner(System.in);
		do {
			System.out.print("요금을 입력 하세요: ");
			num1=s1.nextInt(); //1회 요금
			num2=num2+num1; //누적 요금
		}while(num2<num3); //누적 요금(num2)이 목표(num3=100000)를 못 넘으면 반복
		System.out.println("총 수입은"+num2+"이다");
	}

}
