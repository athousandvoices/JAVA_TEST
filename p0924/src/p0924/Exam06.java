package p0924;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum;
		sum=0;
		i=1;
		do {
			i++;
			if(i%3==0){
			sum=sum+i;
			System.out.println(i);
			}
		}while(i<=100);
		System.out.println("sum : "+sum);
	}

}
