package p0923;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		String first, second;
		System.out.print("성:");
		first=s1.next();
		System.out.print("이름:");
		second=s1.next();
		System.out.println("안녕하세요. "+(first+second)+" 씨");
	}

}
