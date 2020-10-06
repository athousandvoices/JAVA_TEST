package p0923;

import java.util.Scanner;

public class dowhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num=1;
		int num2;
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요. : ");
		num2=s1.nextInt();
		do{
			System.out.println(num2+"*"+num+" = "+(num2*num));
			num++;
			
		/*  System.out.printf("%d&%d=%2d\n",num2,num,num2*num);
		    num++
		*/
			
		}while(num<=10);
	}

}
