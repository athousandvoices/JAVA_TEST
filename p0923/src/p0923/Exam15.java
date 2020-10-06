package p0923;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1, num2;
		System.out.print("변수 a:");
		num1=s1.nextInt();
		System.out.print("변수 b:");
		num2=s1.nextInt();
		if(num1>num2) {
			System.out.println("a가 크다.");
		}else{
			if(num1<num2) {
				System.out.println("b가 크다.");
			}else{
				if(num1==num2) {
					System.out.println("a와 b가 같다.");
				}
			}
		}
	}

}
