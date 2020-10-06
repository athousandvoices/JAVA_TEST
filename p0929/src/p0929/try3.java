package p0929;

import java.util.Scanner;

public class try3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		try {
			square(s1.nextLine()); // 1. 입력을 받아서
		} catch (NumberFormatException e) { // 5. 양도받는 상위 코드 블록
			System.out.println("정수가 아닙니다.");
		}
	}
	
	private static void square(String s) throws NumberFormatException { // 4. 에러라면 상위 코드 블록으로 양도
		int n = Integer.parseInt(s); // 2. 정수로 변환하여
		System.out.println(n * n); // 3. 계산식을 수행하고  (2~3 : 하위 블록에 정의된 square 함수)
	}

}
