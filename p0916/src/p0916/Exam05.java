package p0916;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in); //변수 선언하듯이 임의로
		float r, pi;
		pi=3.14f;
		System.out.println("반지름을 입력하세요:");
		r=s1.nextFloat();
		float area=pi*(r*r);
		System.out.println("원의 면적 = "+area);
	}

}
