package Ch04;

class Company{
	
	// 모듈시험에 나옴 중요
	// 싱글톤 패턴 코드
	private static Company instance;
	private Company() {}
	public static Company getInstance() {
		if(instance==null)
			instance = new Company();
		return instance;
	}
}


public class C03SingleTonMain {

	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		
		System.out.println("com1 : " + com1);
		System.out.println("com2 : " + com2);

	}

}
