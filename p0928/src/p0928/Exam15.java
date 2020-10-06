package p0928;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);       
        int s=0;
        int e=0;
        int p=0;
        int sum=0;
        
        System.out.print("시작 값 입력: ");
        s=scan.nextInt();
        System.out.print("끝 값 입력: ");
        e=scan.nextInt();
        System.out.print("증가 값 입력: ");
        p=scan.nextInt();
 
        for (int i=s; i<=e; i=i+p) { //입력값(s) 고정을 위해 i값 추가.
        	/* i값은 s, i값이 끝 값과 같거나 작을 동안, i값에 계속 p를 더함. */
            sum=sum+i;
        }
        System.out.print(s+"에서 "+e+"까지 "+p+"씩  증가한 값의 합: "+sum);
	}
}
