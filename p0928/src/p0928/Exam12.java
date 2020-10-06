package p0928;

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<5){
			i++;
			int j=0;
			while(j<i){
				j++;
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
