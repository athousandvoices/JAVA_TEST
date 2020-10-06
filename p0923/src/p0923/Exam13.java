package p0923;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1, num2;
		System.out.print("변수 A : ");
		num1=s1.nextInt();
		System.out.print("변수 B : ");
		num2=s1.nextInt();
		if(num1%num2==0) {
			System.out.println("B는 A의 약수입니다.");
		}else{
			System.out.println("B는 A의 약수가 아닙니다.");
		}
	}

}
