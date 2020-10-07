package p1007;

import java.util.Arrays;

public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers=new int[10];
		for(int i=0; i<numbers.length; i++){
			int r=(int)(Math.random()*100); //임의의 수를 가져옴.그리고 r에 *100하여 저장.
			//numbers[i]=(int)(Math.random()*100); 도 같이 동작함.
			numbers[i]=r;
		}
		System.out.print("최초의 리스트: ");
		//for(int i=0; i<numbers.length; i++){
		for(int r1:numbers){
			System.out.print(r1+" ");
		}
		Arrays.sort(numbers);
		System.out.print("\n정렬된 리스트: ");
		for(int r1:numbers){
			System.out.print(r1+" ");
		}

	}

}
