package p1006;

import java.util.Scanner;

public class Exam3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=0;
		int[] score=null;
		int student=0;
		
		do {
		System.out.println("------------------------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("------------------------------------------------------------");
		System.out.print("선택> ");
		num=s.nextInt();
		if(num>5) {
			System.out.println("선택지가 잘못되었습니다.");
		}
		if(num<=0) {
			System.out.println("선택지가 잘못되었습니다.");
		}
		
		switch(num){
		case(1):
			System.out.print("학생수>");
			student=s.nextInt();
			score=new int[student];
			break;
		case(2):
			if(score.length==0){
				System.out.println("학생수의 값이 제대로 입력되지 않았습니다. 재입력하세요.");
				break;
			} else {
				for(int i=0; i<score.length; i++){
					System.out.print("scores["+i+"]>");
					score[i]=s.nextInt();
				}
			break;
			}
		case(3):
			for(int i=0; i<score.length; i++) {
				System.out.println("scores["+i+"]>"+score[i]);
			}
			break;
		case(4):
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
			break;
		case(5):
			System.out.println("프로그램을 종료합니다.");
		}				
		} while(num!=5);
	}

}
