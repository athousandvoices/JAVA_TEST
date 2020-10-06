package p0921;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1, num2;
		System.out.println("첫 번째 정수 : "); num1=s1.nextInt();
		System.out.println("두 번째 정수 : "); num2=s1.nextInt();
		
		if(num1+num2>=60) {
			System.out.println("두 정수의 합이 60보다 크거나 같습니다.");
		}else{
			System.out.println("두 정수의 합이 60보다 작습니다.");
		}
		if(num1>num2) {
			System.out.printf("큰 수는 %d", num1);
		}else{
			if(num1<num2) {
				System.out.printf("큰 수는 %d", num2);
			}else{
				if(num1==num2) {
					System.out.println("두 수가 같습니다.");
				}
			}
		}
	}
}
