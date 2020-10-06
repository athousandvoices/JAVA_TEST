package p0929;

public class try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 10;
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다."); //인수가 없을 때(divisor)
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다."); //인수가 정수가 아닐 때(divisor)
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다."); //인수가 0일 때(divisor)
		} finally {
			System.out.println("항상 실행됩니다."); // 무조건 수행되는 구문
		}
		System.out.println("종료.");
	}		

}
