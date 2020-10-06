package p0917;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!!");
		Scanner s1=new Scanner(System.in);
		double num1,num2;
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		num1=s1.nextDouble();
		System.out.println("두 번째 숫자를 입력하세요  : ");
		num2=s1.nextDouble();	
		/*
		System.out.printf("%d+%d=%5d\n",num1,num2,num1+num2);
		System.out.printf("%d-%d=%5d\n",num1,num2,num1-num2);
		System.out.printf("%d*%d=%5d\n",num1,num2,num1*num2);
		System.out.printf("%d/%d=%5d\n",num1,num2,num1/num2);
		System.out.printf("%d%%d=%5d\n",num1,num2,num1%num2);
		*/
		
		System.out.printf("%6.2f + %6.2f=%8.2f\n",num1,num2,num1+num2); //위의 println을 간략하게 작성 가능
		System.out.printf("%6.2f - %6.2f=%8.2f\n",num1,num2,num1-num2);
		System.out.printf("%6.2f * %6.2f=%8.2f\n",num1,num2,num1*num2);
		System.out.printf("%6.2f / %6.2f=%8.2f\n",num1,num2,num1/num2);
	}

}
