package p0916;
/**
 * 첫 번째 예제 프로그램
 * @author yj-603-04
 * @version 1.0 2020-09-16
 */
public class Hello {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hello world!!!"); //"hello world!!!"를 출력한다.
		System.out.println("헬로 월드!!!");
		System.out.print("hello world!!!\n"); // \n과 println은 HTML에서의 <br>태그 역할 수행
		System.out.println("헬로월드!!!");
		int num1=10, num2=20, num3=3;
		double d1=3.0; //실수는 double, float 사용
		//int num2;
		//int num3;
		//int num4;
		//num1=10;
		//num2=20;
		//num3=3;
		//num4=3.0;
		/**
		 * 정수형 : byte, short, int, long
		 * 실수형 : float, double
		 * 논리형 : boolean > true or false
		 * 문자형 : char, string(문자열)
		 */
			System.out.println("더하기 : "+(num1+num2));
			System.out.println("빼기 : "+(num1-num3));
			System.out.println("곱하기 : "+(num1*num2));
			System.out.println("나누기 : "+(num1/num3));
			System.out.println("나누기 : "+(num1/d1));
			System.out.println("나머지 : "+(num1%num3));
		int x, y;
		
		x=3;
		y=x*x-x+6;
			System.out.println("y : " + y);
	}

}
