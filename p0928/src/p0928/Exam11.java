package p0928;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<6; i++){ //1개부터 찍고, 별의 개수가 6개 미만일 때 계속 증가함.
			for(int j=0; j<i; j++){ //0부터 시작하여 i의 값보다 작은 동안 j의 값이 증가함.
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
