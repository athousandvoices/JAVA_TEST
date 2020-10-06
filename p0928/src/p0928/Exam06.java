package p0928;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int n;
		int sum=0; //합계
		int i;
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?:");
		n=s1.nextInt(); //정수의 개수
		for(i=0; i<n; i++){
			System.out.print("정수:");
			int num1=s1.nextInt();
			sum += num1;
			if(sum>=1000) {
				System.out.println("합계가 1,000을 넘었습니다.");
				System.out.println("마지막 값은 무시합니다.");
				sum -= num1; //합계가 1000을 초과하였기에 마지막 입력받은 num1값을 제함.
				break;
			}
		}
		System.out.println("합계는 "+sum+"입니다.");
		if(i!=0){
			System.out.println("평균은 "+(sum/i)+"입니다.");
		}
	}

}
