package p0923;

import java.util.Scanner;

public class while4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num=1;
		int num2;
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오: ");
		num2=s1.nextInt();
		while(num<=10){
			System.out.println(num2+"*"+num+" = "+(num2*num));
			num++;
		}
	}

}
