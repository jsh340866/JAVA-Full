package Ch14;


class Simple {
	
	private String name;
	private int age;
	private String addr;
	
	//디폴트 생성자
	public Simple() {
		super();
	}
	
	//모든인자 생성자
	public Simple(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		
		
	//getter and setter
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	//toString 재정의
	@Override
	public String toString() {
		return "Simple [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}



public class C02Basic {

	public static void main(String[] args) {
		

	}

}
