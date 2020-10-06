package p1006;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={10,20,30,40,50};
		int sum=0;
		for(int value:num){ //for(int i=0; i>5; i++)의 과정 축소
			System.out.printf("%d\n", value); //value=num 이라는 배열값이 됨.
			sum += value;
		}
		System.out.printf("sum=%d\n", sum);
	}

}
