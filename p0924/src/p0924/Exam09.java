package p0924;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum1=0, sum2=0;
		i=0;
		do{
			i++;
			if(i%2==0){
				sum1+=i;
			}else{
				sum2+=i;
			}
		}while(i<100);
		System.out.println("1부터 100까지의 수중 홀수 합 = "+sum2);
		System.out.println("1부터 100까지의 수중 짝수 합 = "+sum1);
	}
}
