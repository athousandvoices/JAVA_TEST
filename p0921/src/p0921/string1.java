package p0921;

import java.util.Scanner;

public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		String mon;
		System.out.print("월의 이름을 입력하세요.");
		mon=s1.next();
		switch(mon) {
		case "January":
			System.out.println("1월");
			break;
		case "February":
			System.out.println("2월");
			break;
		case "March":
			System.out.println("3월");
			break;
		case "April":
			System.out.println("4월");
			break;
		case "May":
			System.out.println("5월");
			break;
		case "June":
			System.out.println("6월");
			break;
		case "July":
			System.out.println("7월");
			break;
		case "August":
			System.out.println("8월");
			break;
		case "September":
			System.out.println("9월");
			break;
		case "October":
			System.out.println("10월");
			break;
		case "November":
			System.out.println("11월");
			break;
		case "December":
			System.out.println("12월");
			break;
		default:
			System.out.println("에러");
		}
	}

}
