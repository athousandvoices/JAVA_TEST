package p0923;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1;
		System.out.print("정숫값 : ");
		num1=s1.nextInt();
		if(num1>0){
			System.out.println("값이 양수입니다.");
		}else{
			if(num1==0){
				System.out.println("값이 0입니다.");
			}else{
				System.out.println("값이 음수입니다.");
			}
		}
	}

}
