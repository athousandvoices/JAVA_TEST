package p1012;

class Student {
	String name;
	int no;
	// private int no; - 간접 방식으로 접근권한 축소 부여
	int kor;
	int mat;
	int eng;
	int sum;
	static int num; // int 사용하면 생성 마다 0으로 초기화됨.
	Student(){
		System.out.println("생성자");
	}
	Student(int no,String name, int kor, int eng, int mat){
		System.out.println("생성자2");
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	double average;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	void sum() {
		sum=kor+mat+eng;
	}
	void average() {
		average=(double)sum/3;
	}
	
	void print() {
		num++;
		System.out.printf("%d. %d %s %5d %d %d %d %.2f\n", num,no,name,kor,eng,mat,sum,average);
	}
}

public class classExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		st1.setNo(10001);
		st1.setName("홍길동");
		st1.setKor(90);
		st1.setEng(80);
		st1.setMat(60);
		st1.sum();
		st1.average();
		st1.print();
				
		Student st2 = new Student();
		st2.setNo(10002);
		st2.setName("홍길순");
		st2.setKor(95);
		st2.setEng(85);
		st2.setMat(65);
		st2.sum();
		st2.average();
		st2.print();
				
		Student st3 = new Student();
		st3.setNo(10003);
		st3.setName("이순신");
		st3.setKor(87);
		st3.setEng(95);
		st3.setMat(76);
		st3.sum();
		st3.average();
		st3.print();
				
		Student st4 = new Student();
		st4.setNo(10004);
		st4.setName("홍길동");
		st4.setKor(95);
		st4.setEng(87);
		st4.setMat(77);
		st4.sum();
		st4.average();
		st4.print();
				
		Student st5 = new Student();
		st5.setNo(10005);
		st5.setName("홍길동");
		st5.setKor(89);
		st5.setEng(88);
		st5.setMat(79);
		st5.sum();
		st5.average();
		st5.print();
		
		Student st6 = new Student(10006,"이순신",99,90,98);
		st6.sum();
		st6.average();
		st6.print();
		
		int no=st6.getNo();
		String name=st6.getName();
		System.out.println("no : "+no+" name : "+name);
	}

}
