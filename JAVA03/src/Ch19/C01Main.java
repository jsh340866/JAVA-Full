package Ch19;

@C01CustomAnnotation()
class Simple {
	String value;
	int number;
	boolean isOpen;
	
	Simple() {
		C01CustomAnnotation ref = this.getClass().getAnnotation(C01CustomAnnotation.class);
		System.out.println("VALUE : " + ref.value());
		System.out.println("NUMBER : " + ref.number());
		System.out.println("ISOPEN : " + ref.isOpen());
	}
	
}

public class C01Main {

	public static void main(String[] args) {
		Simple ob = new Simple();
		
		
	}

}
