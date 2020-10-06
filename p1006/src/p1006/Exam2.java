package p1006;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[]num=new int[10];
		System.out.print("정수 10개 입력>>");
		for(int i=0; i<10; i++) { //10개의 정수를 입력받을 때 까지
			num[i]=s.nextInt(); //배열에 저장
		}
		for(int i=0; i<num.length; i++) { //i가 배열의 길이보다 작을 동안
			for(int j=i+1; j<num.length; j++) { //j가 i보다 +1에서 시작하게
				if(num[i]>num[j]){ //i번 배열의 수가 j번 배열의 수 보다 높을 때(오름차순)
					int num1=num[i]; //i번 배열의 수를 num1 변수에 저장
					num[i]=num[j]; //저장된 i번 배열을 j번 배열에 저장
					num[j]=num1; //j번 배열을 다시 num1 변수에 저장
				}
			}
		}
	/*	for(int i=0; i<num.length; i++) { //i가 배열의 길이보다 작을 동안
		for(int j=i+1; j<num.length; j++) { //j가 i보다 +1에서 시작하게
			if(num[i]<num[j]){ //j번 배열의 수가 i번 배열의 수 보다 높을 때(내림차순)
				int num1=num[i]; //i번 배열의 수를 num1 변수에 저장
				num[i]=num[j]; //저장된 i번 배열을 j번 배열에 저장
				num[j]=num1; //j번 배열을 다시 num1 변수에 저장
				}
			}
		}
	*/
		 
		for(int i=0; i<10; i++) {
			System.out.print(num[i]+" ");
		}
	}
}