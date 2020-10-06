package p0924;

import java.util.Scanner;

public class dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int x,y,r;
		System.out.print("두개의 정수를 입력하시오(큰 수,작은 수): ");
		x=s1.nextInt();
		y=s1.nextInt();
		while(y!=0){
			r=x%y;
			x=y;
			y=r;
		}
		System.out.println("최대 공약수는 "+x);
	}

}
