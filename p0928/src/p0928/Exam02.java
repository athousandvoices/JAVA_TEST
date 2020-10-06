package p0928;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1,i;
		int sum=0;
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값:");
		num1=s1.nextInt();
		for (i=1; i<=num1; i++){
			sum += i;
			if(i==num1){
				System.out.printf("%d",i); //if i==num1 일때 + 연산을 수행하지 않음.
			}else{
			System.out.printf("%d+",i); //else, + 연산을 계속 수행.
			}
			
		}System.out.printf("=%d",sum); //for 반복문 빠져나와서 = sum 수행
	}

}
