package p0928;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1;
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는?:");
		num1=s1.nextInt();
		for(int i=num1; i>0; i--){ //처음에 num1개를 찍고, 1개씩 감소하는 반복문
			for(int j=0; j<i; j++){
				System.out.printf("*"); //i값 개수에 따라 별의 개수가 변하도록 함.
			}
			System.out.println();
		}
	}

}
