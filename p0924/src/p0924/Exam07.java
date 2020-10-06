package p0924;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum1=0, sum2=0;
		for(i=1;i<=100;i++){ //i++ ---> i=i+1 , 100까지 반복
			if(i%2==0){
			sum1+=i; //sum+=i;
		}else{
		sum2+=i;
		}
		}
		System.out.println("1부터 100까지의 수중 홀수 합 = "+sum2);
		System.out.println("1부터 100까지의 수중 짝수 합 = "+sum1);
	}
}
