package p0916;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in); //변수 선언하듯이 임의로
		int num1, num2;
		System.out.println("첫 번째 정수를 입력하세요:");
		num1=s1.nextInt();
		System.out.println("두 번째 정수를 입력하세요:");
		num2=s1.nextInt();
		System.out.println(""+(num1+num2));
	}

}
