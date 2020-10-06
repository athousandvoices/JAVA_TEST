package p0923;

import java.util.Scanner;

public class Exam23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1, num2;
		System.out.print("정수 a:");
		num1=s1.nextInt();
		System.out.print("정수 b:");
		num2=s1.nextInt();
		if(num1>num2){
			System.out.println("작은 값은 "+num2+"입니다.");
			System.out.println("큰 값은 "+num1+"입니다.");
		}else{
			if(num1<num2){
				System.out.println("작은 값은 "+num1+"입니다.");
				System.out.println("큰 값은 "+num2+"입니다.");
			}else{
				if(num1==num2){
					System.out.println("두 값이 같습니다.");
				}
			}
		}
	}

}
