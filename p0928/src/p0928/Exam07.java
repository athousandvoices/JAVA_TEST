package p0928;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int n;
		int sum=0; //합계
		int i;
		int j=0; //평균을 구하기 위한 횟수의 값.
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?:");
		n=s1.nextInt(); //정수의 개수
		for(i=0; i<n; i++){
			System.out.print("정수:");
			int num1=s1.nextInt();
			sum += num1;
			if(num1<0) { //입력받은 값이 음수일 경우
				System.out.println("음수는 더하지 않습니다.");
				sum -= num1; //마지막 입력받은 값을 제함.
				j += i; //평균을 구하기 위한 j값에서 마지막 횟수(i)를 제함.
			}
		}
		System.out.println("합계는 "+sum+"입니다.");
		if(i!=0){
			System.out.println("평균은 "+(sum/(i-j))+"입니다.");
		}
	}

}
