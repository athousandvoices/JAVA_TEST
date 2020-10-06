package p0928;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num1, i, j;
		System.out.print("정숫값:");
		num1=s1.nextInt();
		for (i=1; i<=num1; i++){ //최초 i는 1이고, i가 입력받은 값보다 작거나 같을 동안 i는 증가한다.
			j=i*i; //j는 i의 제곱
			if(i==num1){
			System.out.println(num1+"의 제곱은"+j+"입니다."); //i가 입력받은 값과 같아졌을 때 마지막(입력받은 값의 제곱)출력
			}else{
				System.out.println(i+"의 제곱은"+j+"입니다."); //그렇지 않을 땐 계속 증가하는 i의 제곱 반복 출력
			}
		}
	}

}
