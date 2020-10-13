package p1012;

class ball {
	double radius = 2.0; // 필드: 객체의 속성을 나타낸다.
	double area;
	double getVolume() {
		return 4 / 3 * 3.14 * radius * radius * radius;
	} // 메서드: 객체의 동작을 나타낸다.
	void getRadius(double rad){
		area=rad*rad*3.14;
	}
	void print(){
		System.out.println("radius : "+radius);
	}
}

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ball b1=new ball();
		double d1=b1.getVolume();
		System.out.println("getVolume : "+d1);
		b1.getRadius(b1.radius);
		System.out.println("area : "+b1.area);
		b1.print();
		
		ball b2=new ball();
		b2.radius=10.0;
		double d2=b2.getVolume();
		System.out.println("getVolume : "+d2);
		b2.getRadius(b2.radius);
		System.out.println("area : "+b2.area);
		b2.print();
	}

}
