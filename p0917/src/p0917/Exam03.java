package p0917;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner S1=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		num1=S1.nextInt();
		if(num1%7==0){
			System.out.println(num1+"은 7의 배수입니다."); //참일 경우에만 실행됨.
		}else{
			System.out.println(num1+"은 7의 배수가 아닙니다."); //거짓일 경우에만 실행됨.
		}
		}
	}
