package p0928;

import java.util.Scanner;

public class Exam16 {

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
 
        int i=s; //아래 s값의 출력을 위해서
        while (i<e) { //i(s)값이 끝 값을 초과하기 전까지
        	i=i+p; //i(s)값에 p값을 계속 더하고
            sum=sum+i-p; //합계값에 계속 i값을 더하다 마지막 p값을 빼줌
        }
        System.out.print(s+"에서 "+e+"까지 "+p+"씩  증가한 값의 합: "+sum);
	}

}
