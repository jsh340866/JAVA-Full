package Ch05;


class Super{
	int n1;
}
class Sub extends Super {
	int n2;
}


public class C06UpDownCastingMain중요 {

	public static void main(String[] args) {
		//casting : 형변환
		
		//NoCasting : 형변환 x
		Super ob1 = new Super();
		ob1.n1 = 10;
		
		
		//Upcasting[★★★★★]  : 상위클래스형 참조변수 = 하위클래스형 객체
		//				    : 자동형변환(메모리 영역의 침범우려 우려가 없기 때문에)
		//이유				: 1) !상속관계로 구성된 모든 하위객체를 연결할 수 있다.
		//					: 2) !Upcasting된 상태에서는 재정의된 메서드에 접근 가능하다.
		
		//Downcasting[★★★★★]
		
		
	}

}
