package p0923;

public class while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int sum=0;
		
		while(num<=100){ //적힌 숫자(100)까지 찍어 줌.
			if(num%2==0){
				System.out.println(num);
				sum=sum+num;
			}
			num++;
		}
		System.out.println("합 : "+sum);
	}
}
