package p0923;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		double num1, num2;
		System.out.println("삼각형의 넓이를 구합니다.");
		System.out.print("밑변 : ");
		num1=s1.nextDouble();
		System.out.print("높이 : ");
		num2=s1.nextDouble();
		System.out.println("넓이는 "+((num1*num2)/2)+"입니다.");
	}

}
