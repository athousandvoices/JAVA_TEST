package p0921;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		double num1, num2, num3;
		System.out.print("첫번째 수:");
		num1=s1.nextDouble();
		System.out.print("두번째 수:");
		num2=s1.nextDouble();
		System.out.print("세번째 수:");
		num3=s1.nextDouble();
		System.out.println(num1+" + "+num2+" + "+num3+" = "+(num1+num2+num3));
		System.out.println("("+num1+" + "+num2+" + "+num3+")"+" 세 수의 평균 : "+(Math.round(((num1+num2+num3)/3)*100)/100.0));
	}
}
