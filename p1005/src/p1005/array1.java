package p1005;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[10]; // num의 이름으로 10개의 공간이 잡힘.]
		// int [] num;
		// num=new int[10];
		for(int i=0; i<10; i++) {
			num[i]=i;
		}
		for(int i=0; i<10; i++) {
			System.out.printf("num[%d]=%d\n", i,num[i]);
		}
	}

}
