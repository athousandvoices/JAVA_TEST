package p0921;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		String sco;
		System.out.print("혜택 등급을 입력하세요 : ");
		sco=s1.next();
		if (sco.equals("A")) {
			System.out.println("VVIP 혜택을 받으실 수 있습니다.");
		}else{
			if(sco.equals("B")) {
				System.out.println("VIP 혜택을 받으실 수 있습니다.");
			}else{
				if(sco.equals("C")) {
					System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
				}else{
					if(sco.equals("D")) {
					System.out.println("일반 회원 혜택을 받으실 수 있습니다.");
					}else{
						System.out.println("혜택이 없습니다.");
					}
				}
			}
		}
	}

}
