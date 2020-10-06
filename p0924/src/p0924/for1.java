package p0924;

public class for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;/*초기식(i는 1으로 정의)*/ i<5;/*i는 5보다 작은 수로 정의*/ i++/*i의 증감식(i=i+1)*/) {
			System.out.println("hello");
		}
		
		/*for문을 while문으로 변경하면*/
		i=1; //초기식은 while 구문의 위로
		while(i<5){ //조건문은 while 구문의 내부로
			System.out.println("hello");
			i++; //증감식은 while 구문의 아래로
		}
	}

}
