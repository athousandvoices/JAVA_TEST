package p1007;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] s=new int[3][5]; //[행][열]
		int[][] arr={{10,20,30},{40,50,60},{70,80,90}};
		System.out.println("배열크기 : "+arr.length+" "+arr[1].length);
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
