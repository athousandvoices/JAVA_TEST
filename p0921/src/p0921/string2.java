package p0921;

import java.util.Scanner;

public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		String mon;
		System.out.println("월의 이름을 입력하세요.");
		mon=s1.next();
		if(mon.equals("Jan")) {
			System.out.println("1월");
		}
	}

}
