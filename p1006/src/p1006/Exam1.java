package p1006;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[]num=new int[10];
		System.out.print("정수 10개를 입력하시오>>");
		for(int i=0; i<10; i++) {
			num[i]=s.nextInt();
		}
		System.out.print("3의 배수>>");
		for(int i=0; i<10; i++) {
			if(num[i]%3==0){
				System.out.print(num[i]+" ");
			}
		}
	}
}
