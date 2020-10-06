package p0924;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int tries=0;
		String answer="A", guess1, guess2, guess3, door1, door2, doort1 = null, doort2;
			System.out.println("천국으로 가는 문과 지옥으로 가는 문이 있다.");
			System.out.println("하지만 두 문이 똑같이 생겨서 구분할 수가 없다.");
			System.out.println("그리고 두 문 앞에 각각 천국에서 사는 천사와 지옥에서 사는 악마가 서 있는데");
			System.out.println("역시 천사와 악마도 똑같이 생겨서 구분할 수가 없다.");
			System.out.println("천사와 악마 모두 어떤게 천국의 문인지, 어떤게 지옥의 문인지 알고 있다.");
			System.out.println("단, 천국의 문 앞에는 반드시 천사가, 지옥의 문 앞에는 반드시 악마가 있다는 보장은 없다.");
			System.out.println("천국의 문 앞에 있는게 천사일 수도 악마일 수도 있고 지옥의 문 앞에 있는게 천사일 수도 악마일 수도 있다.");
			System.out.println("천사는 진실만을, 악마는 거짓만을 말한다.");
			System.out.println("천사는 악마가 거짓만을 말할 것을, 악마는 천사가 진실만을 말할 것을 알고있다.");
			System.out.println("두 개의 문 중 하나를 지목한 다음, 질문을 고르시오.");
			System.out.print("A or B ?");
			door1=s1.next();
			switch(door1){
			case"A":
				System.out.println("A 문을 지목하였습니다.");
				System.out.println("질문. 옆의 녀석에게 내가 지목한 이 문이 천국의 문이 맞냐고 질문한다면, 맞다고 대답할까?");
				System.out.println("a: 아니오.");
				System.out.println("b: 아니오.");
				System.out.println("이 때 천국의 문은?");
				System.out.print("A or B ?");
				doort1=s1.next();
				switch(doort1){
				case"A":
					System.out.println("정답입니다.");
					break;
				case"B":
					System.out.println("오답입니다.");
					break;
				}
				break;
				
			case"B":
				System.out.println("B 문을 지목하였습니다.");
				System.out.println("질문. 옆의 녀석에게 내가 지목한 이 문이 천국의 문이 맞냐고 질문한다면, 맞다고 대답할까?");
				System.out.println("a: 예.");
				System.out.println("b: 예.");
				System.out.println("이 때 천국의 문은?");
				System.out.print("A or B ?");
				doort1=s1.next();
				switch(doort1){
				case"A":
					System.out.println("정답입니다.");
					break;
				case"B":
					System.out.println("오답입니다.");
					break;
				}
				break;
			}
	}
}



