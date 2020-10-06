package p0923;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in); //변수 선언하듯이 임의로
		int num1, num2;
		num1=s1.nextInt();
		num2=s1.nextInt();
		System.out.println("x값은 "+num1+"입니다.");
		System.out.println("y값은 "+num2+"입니다.");
		System.out.println("합계는 "+(num1+num2)+"입니다.");
		System.out.println("평균은 "+((num1+num2)/2)+"입니다.");
	}

}
