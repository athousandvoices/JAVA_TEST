package p0923;

import java.util.Scanner;

public class Exam20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		double num1, num2;
		System.out.print("실수 a:");
		num1=s1.nextDouble();
		System.out.print("실수 b:");
		num2=s1.nextDouble();
		if(num1<num2){
			System.out.println("큰 쪽의 값은 "+num2+"입니다.");
		}else{
			if(num1>num2){
				System.out.println("큰 쪽의 값은 "+num1+"입니다.");
			}else{
				if(num1==num2){
					System.out.println("두 값이 같습니다.");
				}else{
					System.out.println("잘못된 값입니다.");
				}
			}
		}
	}

}
