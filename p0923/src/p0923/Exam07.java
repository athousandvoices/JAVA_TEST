package p0923;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		double num1, num2;
		System.out.print("x값 : ");
		num1=s1.nextDouble();
		System.out.print("y값 : ");
		num2=s1.nextDouble();
		System.out.println("합계는 "+(num1+num2)+"입니다.");
		System.out.println("평균은 "+((num1+num2)/2)+"입니다.");
	}

}
