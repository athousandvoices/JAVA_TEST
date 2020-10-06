package p0917;

import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner S1=new Scanner(System.in);
		
		System.out.println("시험 점수를 입력하세요: ");
		num1=S1.nextInt();
		System.out.println("면접 점수를 입력하세요: ");
		num2=S1.nextInt();
		
		if((num1*0.7)+(num2*0.3)>=80){ //and 연산자 &&, or 연산자 ||
			System.out.println("합격을 축하합니다.");
		}else{
			System.out.println("아쉽지만 불합격입니다.");
		}
	}

}
