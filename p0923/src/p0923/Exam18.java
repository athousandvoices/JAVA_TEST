package p0923;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1;
		System.out.print("정숫값:");
		num1=s1.nextInt();
		if(num1%3==0){
			System.out.println("이 값은 3으로 나누어집니다.");
		}else{
			if(num1<0){
				System.out.println("양수가 아닌 값을 입력했습니다.");
			}else{
				System.out.println("이 값을 3으로 나눈 나머지는"+(num1%3)+"입니다.");
			}
		}
	}

}
