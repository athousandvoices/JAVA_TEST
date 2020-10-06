package p0924;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum;
		sum=0;
		i=1;
		while(i<=100){
			i++;
			if(i%3==0){
			sum=sum+i;
			System.out.println("i : "+i);
			}
		}
		System.out.println("sum : "+sum);
	}
}
