package Ch01;

class C08Simple {
	// 속성
	int n1;
	double n2;
	boolean n3;
	String n4;

	
	//기능
	
	//생성자
	
	
	//toString재정의
	@Override
	public String toString() {
		return "C08Simple [n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4 + "]";
	}
}


public class C08ConstructorMain {

	public static void main(String[] args) {
		C08Simple ob1 = new C08Simple();
		
		System.out.println(ob1);
		

	}

}
