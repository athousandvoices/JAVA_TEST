package p0916;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in); //변수 선언하듯이 임의로
		Double r, height;
		System.out.println("원기둥의 밑면의 반지름은?:");
		r=s1.nextDouble();
		System.out.println("원기둥의 높이는?:");
		height=s1.nextDouble();
		System.out.println("원기둥의 부피는  "+(r*r*height*3.14));
	}

}
