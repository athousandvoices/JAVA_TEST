package p0924;

public class for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k;
		
		/*
		for(i=0; i<5; i++){
			for(k=0; k<5; k++){
				System.out.println("반복 문장");
			}
		}
		*/
		
		for(i=1;i<=5;i++){ //단순 나열
			for(k=1;k<=5;k++){
				System.out.printf("i=%d, k=%d\n",i,k);
			}
		}
		
		for(i=1;i<=5;i++){ //구구단
			for(k=1;k<=5;k++){
				System.out.printf("%d * %d = %d\n",i,k,i*k);
			}
		}
	}

}
