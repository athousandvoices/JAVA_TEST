package p0917;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double num1;
		Scanner s1=new Scanner(System.in);
		
		/*
		System.out.print("숫자 입력 : ");
		num1=s1.nextDouble();
		if(num1%2==0){
			System.out.println("짝수이다."); //참일 경우에만 실행됨.
		}else{
			System.out.println("홀수이다."); //거짓일 경우에만 실행됨.
		}
		*/
		
		/*
		if(num1>100){
			System.out.println("입력된 수는 100보다 크다."); //참일 경우에만 실행됨.
		}else{
			System.out.println("입력된 수는 100보다 크지 않다."); //거짓일 경우에만 실행됨.
		}
		*/
		
		System.out.print("점수 입력  : ");
		num1=s1.nextDouble();
		if(num1>=90){
			System.out.println("A학점");
		}else{
			if(num1>=80){
				System.out.println("B학점");
			}else{
				if(num1>=70){
					System.out.println("C학점");
				}else{
					if(num1>=60){
						System.out.println("D학점");
					}else{
						System.out.println("F학점");
					}
				}
			}
				
			}			
	}

}
