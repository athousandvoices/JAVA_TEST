package p0924;

public class for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum=0;
		for(i=1;i<=100;i++){
			sum=sum+i;
			if(sum>1000){
				break; //sum의 값이 1000을 넘겼을 때 반복문을 빠져나오는 구문
			}
		}
		System.out.printf("i=%d, sum=%d",i,sum);
		/*i=45, sum=1035의 결과 = i가 45일 때 sum의 값이 1045으로 1000을 초과하여 반복문 break*/
	}

}
