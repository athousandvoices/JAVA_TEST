package p0924;

public class for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 짝수 출력 구문 */
		int i, sum=0;
		for(i=1;i<=100;i++){

			if(i%2==1){
				continue; //1%2==1의 조건을 만나면 아래 구문을 수행하지 않고 위로 돌아감.
			}
			System.out.printf("i=%d\n",i);
		}
	}
}
