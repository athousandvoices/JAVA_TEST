package p0923;

import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1;
		System.out.print("정숫값:");
		num1=s1.nextInt();
		if(num1%10==0){
			System.out.println("이 값은 10의 배수입니다.");
		}else{
			if(num1<0){
				System.out.println("음의 정숫값을 입력했습니다.");
			}else{
				System.out.println("이 값은 10의 배수가 아닙니다.");
			}
		}
	}

}
