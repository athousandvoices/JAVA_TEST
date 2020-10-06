package p0916;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=3;		
		System.out.println("x="+(x/y));
		System.out.println("x="+((float)x/y)); //상수 임시형변환
		
		System.out.println("x="+x);
		System.out.println("x="+(++x)); //여기부터 +1 증가 --x는 마찬가지로 여기부터 -1 감소

		x=10;
		System.out.println("x="+x);
		System.out.println("x="+(x++)); //다음부터 +1 증가 x--는 마찬가지로 다음부터 -1 감소
		System.out.println("x="+x);
		
		float f1=10.567f;
		System.out.println("f1="+(f1));
		System.out.println("f1="+((int)f1)); //정수 임시형변환
	}

}
