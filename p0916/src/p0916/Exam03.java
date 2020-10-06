package p0916;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in); //변수 선언하듯이 임의로
		Double length, width, area, round;
		System.out.println("사각형의 가로를 입력하시오:");
		length=s1.nextDouble();
		System.out.println("사각형의 세로를 입력하시오:");
		width=s1.nextDouble();
		System.out.println("사각형의 넓이는 "+(length*width));
		System.out.println("사각형의 둘레는 "+((length*2)+(width*2)));
	}

}
