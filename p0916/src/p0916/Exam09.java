package p0916;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in); //변수 선언하듯이 임의로
		Double num1, num2;
		System.out.println("첫 번째 수를 입력하세요(실수):");
		num1=s1.nextDouble();
		System.out.println("두 번째 수를 입력하세요(실수):");
		num2=s1.nextDouble();
		System.out.println(num1+ "+" +num2+ "=" +(num1+num2));
		System.out.println(num1+ "-" +num2+ "=" +(num1-num2));
		System.out.println(num1+ "*" +num2+ "=" +(num1*num2));
		System.out.println(num1+ "/" +num2+ "=" +(Math.round((num1/num2)*100)/100.0));
		System.out.println(num1+ "%" +num2+ "=" +(Math.round((num1%num2)*100)/100.0));
	}

}
