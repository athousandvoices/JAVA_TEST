package p0921;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1, num2;
		System.out.println("실적을 입력하시오(단위: 만 원)");
		num1=s1.nextInt();
		if (num1>=1000) {
			System.out.println("실적 달성");
			num2=(num1-1000)/10;
			System.out.println("보너스:"+num2+"만 원");
		}
	}

}
