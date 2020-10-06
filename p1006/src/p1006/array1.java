package p1006;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int array[]=new int[6];
		int index=0;
		
		for(int i=0; i<6; i++) {
			array[i] += i*10;
		}
		System.out.print("탐색할 값을 입력하시오: ");
		int num=s.nextInt();
		for(int i=0; i<array.length; i++) {
			if(array[i]==num) { //입력받은 num값이 i 위치 배열의 값과 일치할 때.
				index=1;
				System.out.println(num+"값은 "+i+"위치에 있습니다.");
				break;
			}
		}
		if(index==0){
			System.out.println("찾는 값이 없습니다.");
		}
	}
}

