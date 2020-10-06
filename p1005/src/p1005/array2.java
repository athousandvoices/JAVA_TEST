package p1005;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("학생수를 입력하시오:");
		final int COUNT=s.nextInt()+1;
		int num[]=new int[COUNT];
		int sum=0;
		
		for(int i=1; i<COUNT; i++) {
			System.out.print(i+"번 학생의 성적을 입력하시오:");
			num[i]=s.nextInt();
			sum += num[i];
		}
		System.out.println("평균 성적은 "+(sum/(COUNT-1))+"입니다.");
		System.out.printf("평균 성적은 %d입니다.",sum/(COUNT-1));
	}

}

// final int COUNT=5;
// 후에 i<score.length
// sum/score.length
