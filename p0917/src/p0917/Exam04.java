package p0917;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner S1=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num1=S1.nextInt();
		if(num1>100){
			System.out.println("100보다 크군요.."); //참일 경우에만 실행됨.
		}else{
			if(num1==100){
				System.out.println("100과 같군요..");
			}else{
				System.out.println("100보다 작군요..");
			}
		}
	}

}
