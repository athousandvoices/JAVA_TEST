package p0924;

import java.util.Scanner;

public class dowhile1 { //정확한 입력받기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num;
		do {
			System.out.print("올바른 월을 입력하시오 [1-12]: ");
			num=s1.nextInt();
		}while(num<1||num>12);
		System.out.println("사용자가 입력한 월은 "+num);
	}

}
