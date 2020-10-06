package p0924;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum=0;
		for(i=1;i<=100;i++){ //i++ ---> i=i+1 , 100까지 반복 
			if(i%3==0){
			sum=sum+i;
			System.out.println(i);
			}
		}
		System.out.println("sum : "+sum);
	}
}
