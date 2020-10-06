package p1005;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[]={1190000, 1140000, 1080000, 1000000, 990000};
		int min = price[0];
		int max = price[0];
		
		for(int i=0; i<price.length; i++) {
			if(min>price[i]){
				min=price[i];
			}
			if(max<price[i]){
				max=price[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
}
