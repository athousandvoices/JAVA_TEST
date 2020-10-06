package p0928;

public class Exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		num1=0;
		while(num1<9){
			num1++;
			num2=0;
			while(num2<9){
				num2++;
				System.out.print(num1+"*"+num2+"="+num1*num2+" ");
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
