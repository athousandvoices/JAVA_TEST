package p0923;

import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("정수 a:");
		num1=s1.nextInt();
		System.out.print("정수 b:");
		num2=s1.nextInt();
		System.out.print("정수 c:");
		num3=s1.nextInt();
		if(num1<num2&&num1<num3){
			System.out.println("최솟값은 "+num1+"입니다.");
		}else{
			if(num2<num1&&num2<num3){
				System.out.println("최솟값은 "+num2+"입니다.");
			}else{
				if(num3<num1&&num3<num2){
					System.out.println("최솟값은 "+num3+"입니다.");
				}
			}
		}
	}

}
