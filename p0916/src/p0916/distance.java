package p0916;

public class distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long speed=300000;
		long min=60;
		long hour=60*min;
		long day=24*hour;
		long year=365*day;
		long dist=speed*year;
		/*낮은 값부터 높은 값 순으로 정의할 것*/
			System.out.println("빛이 1년 동안 가는 거리 : "+(dist));
	}

}
