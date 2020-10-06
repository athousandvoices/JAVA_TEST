package p0928;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int n;
		int sum=0; //합계
		int i;
		System.out.print("사람 수:");
		n=s1.nextInt();
		for(i=1; i<n+1; i++){
			System.out.print(i+"번의 점수:");
			int sco=s1.nextInt();
			sum += sco;
		}
		int max=0, min=0;
		System.out.println("합계는 "+sum+"입니다.");
		double average = (double)sum/i;
		if(i!=0){
			System.out.println("평균은 "+average+"입니다.");
		}
		System.out.println("최고점은"+max+"점입니다.");
	}
}
