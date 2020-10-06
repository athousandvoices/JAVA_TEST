package p0929;

public class try2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=0;
		try {
			System.out.println(num1/num2);
		} catch(Exception e) { //모든 에러 추적
			e.printStackTrace(); //에러 추적하여 출력
			System.out.println("에러.");
		} finally { //여기에 db클로즈, 스캐너클로즈 구문을 넣어주면 좋음.
			System.out.println("종료.");
		}
	}

}
