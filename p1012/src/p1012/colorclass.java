package p1012;

class Color {
	String color;
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	void print() {
		System.out.println("선택한 Color : "+color);
	}
}

public class colorclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c1=new Color();
		c1.setColor("빨강"); // (간접접근)
		//c1.color="발강" (직접접근)
		c1.print();
		
		Color c2=new Color();
		c2.color="주황";
		c2.print();
		
		Color c3=new Color();
		c3.color="노랑";
		c3.print();
		
		Color c4=new Color();
		c4.color="초록";
		c4.print();
		
		Color c5=new Color();
		c5.color="파랑";
		c5.print();
		
		Color c6=new Color();
		c6.color="남색";
		c6.print();
		
		Color c7=new Color();
		c7.color="보라";
		c7.print();
	}

}
