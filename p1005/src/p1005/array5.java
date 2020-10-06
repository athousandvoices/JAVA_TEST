package p1005;

import java.util.Scanner;

public class array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요 : ");
		int COUNT = s.nextInt();
		int price[]=new int[COUNT];
		
		int max = price[0];
		int min = price[0];
		
		for(int i=0; i<price.length; i++){
			System.out.print((i+1)+"번째 상품의 가격을 입력하세요 : ");
			price[i] = s.nextInt();
			
			if(i==0) min=price[i];
			
			if(max<price[i]) {
				max=price[i];
			}				
			if(min>price[i]) {
				min=price[i];				
			}
		}	
		System.out.printf("최고가 : %d\n",max);
		System.out.printf("최소가 : %d\n",min);
	}
}