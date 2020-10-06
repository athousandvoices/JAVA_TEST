package p0917;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner S1=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 ==> ");
		num1=S1.nextInt();
		if(num1>=80){
			System.out.println("축하합니다. 합격입니다."); //참일 경우에만 실행됨.
		}else{
			System.out.println("아쉽네요. 불합격입니다."); //거짓일 경우에만 실행됨.
		}
	}

}
