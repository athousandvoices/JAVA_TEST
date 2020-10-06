package p0924;

public class for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum=0;
		for(i=1;i<=100;i++){ //i++ ---> i=i+1 , 100까지 반복
			sum=sum+i; //sum+=i;
			System.out.println("i : "+i);
		}
		System.out.println("sum : "+sum);
		
		sum=0;
		i=1;
		while(i<=100){
			sum=sum+i;
			System.out.println("i : "+i);
			i++;
		}
		System.out.println("sum : "+sum);
	}

}
