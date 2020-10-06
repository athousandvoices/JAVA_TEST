package p0916;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in); //변수 선언하듯이 임의로
		Double km, gas;
		System.out.println("주행거리를 입력하세요:");
		km=s1.nextDouble();
		System.out.println("사용한 휘발유 양을 입력하세요:");
		gas=s1.nextDouble();
		System.out.println("연비 "+(km/gas));
	}

}
