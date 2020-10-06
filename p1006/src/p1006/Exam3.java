package p1006;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean run=true;
		int num=0;
		int[] score=null;
		int student=0;
		
		while(run){
		System.out.println("------------------------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("------------------------------------------------------------");
		System.out.print("선택> ");
		num=s.nextInt();
			if(num==1) {
				System.out.print("학생수>");
				student=s.nextInt();
				score=new int[student];
			} else if(num==2) {
				if(score.length==0){
					System.out.println("입력받은 학생수의 값이 존재하지 않습니다. 재입력하십시오.");
					num=1;
				} else {
					for(int i=0; i<score.length; i++){
						System.out.print("score["+i+"]>");
						score[i]=s.nextInt();
					}
				}
			} else if (num==3) {
				for(int i=0; i<student; i++){
					System.out.println("score["+i+"]>"+score[i]);
				}
			} else if (num==4) {
				int sum=0;
				int max=0;
				double average=0.0;
				for(int i=0; i<student; i++){
					if(score[i]>max){
						max=score[i];
					}
					sum += score[i];
				}
					
					average=(double)sum/student;
					
					System.out.println("최고 점수 : "+max);
					System.out.println("평균 점수 : "+average);
	
			} else if (num>5) {
				System.out.println("선택지가 잘못되었습니다.");
			} else if (num<=0) {
				System.out.println("선택지가 잘못되었습니다.");
			} else if (num==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
