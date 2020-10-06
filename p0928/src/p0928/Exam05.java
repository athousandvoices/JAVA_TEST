package p0928;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int n;
		int sum=0; //합계
		int i;
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?:");
		n=s1.nextInt(); //정수의 개수
		for(i=0; i<n; i++){ //최초 i는 0, i가 입력받은 수보다 작은 동안 i는 증가한다.
			System.out.print("정수(0으로 종료):"); //반복하여 정수 입력받음.
			int num1=s1.nextInt(); 
			if(num1==0) break; //입력받은 값이 0일 때 for문 break
			sum += num1; //합계는 입력받은 값들의 도합
		}
		System.out.println("합계는"+sum+"입니다.");
		if(i!=0){ //i와 0이 같은지 비교
			System.out.println("평균은"+(sum/i)+"입니다.");
		}
	}

}
