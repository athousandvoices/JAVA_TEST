package p0921;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		String id;
		int pw;
		System.out.print("아이디:");
		id=s1.next();
		System.out.print("패스워드:");
		pw=s1.nextInt();
		if(id.equals("java")&&pw==12345) {
			System.out.println("로그인 성공");
		}else{
			if(id.equals("java")) {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
			if(pw==12345) {
				System.out.println("로그인 실패:아이디 존재하지 않음");
			}else{
				System.out.println("로그인 실패.아이디가 존재하지 않거나 패스워드에 오류가 있습니다.");
			}
		}
	}
}		
