package p0921;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		String sco;
		System.out.print("등급을 입력하세요 : ");
		sco=s1.next();
		if (sco.equals("a")) {
			System.out.println("우수 회원입니다.");
		}else{
			if(sco.equals("A")) {
				System.out.println("우수 회원입니다.");
			}else{
				if(sco.equals("b")) {
					System.out.println("일반 회원입니다.");
				}else{
					if(sco.equals("B")) {
						System.out.println("일반 회원입니다.");
					}else{
						System.out.println("손님입니다.");
					}
				}
			}
		}
	}

}
