package p0928;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int sum=0; //합계
		int i;
		System.out.println("1부터 n까지의 합 중에서 5000을 넘지 않는 가장 큰 합은?");
		for(n=1; sum<=5000; n++){ //1부터 시작하여 합계가 5000보다 작거나 같은 동안 n은 증가한다.
			sum += n; //반복되는 n의 증가값을 합산하여 합계를 구함.
			if(sum>5000) { //합계가 5000보다 클 때
				sum -= n; //마지막 n값을 제함.
				break;
			}
		}
		System.out.println("1부터"+n+"까지의 합이"+sum+"입니다.");
	}
}
