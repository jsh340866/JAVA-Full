package Ch17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Person {
	String name;
	Integer age;
	//디폴트
	public Person() {};
	
	//모든인자
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}


public class C01StreamMain {

	public static void main(String[] args) {
		
		// init
		List<Integer> li1 = Arrays.asList(1,2,3,4,5);
		System.out.println("li1 : " + li1);
		
		// filter 함수
		List<Integer> li2 = li1.stream()
							   .filter((n)->{return n%2==0;})	// filter 의 return = 조건식
							   .collect(Collectors.toList());	// 받은 값을 다시 리스트로 만듬
		System.out.println("li2 : " + li2);
		
		// map 함수
		List<Integer> li3 = li1.stream()
							   .filter((n)->{return n%2==1;})	// 1,3,5
							   .map((n)->{return n*n;})			// 받은 값 수정 1,9,25
							   .collect(Collectors.toList());
		System.out.println("li3 : " + li3);
		
		// sorted 함수
		List<Person> persons = Arrays.asList(
					new Person("홍길동",45),
					new Person("남길동",55),
					new Person("서길동",35),
					new Person("유재석",53),
					new Person("서장훈",52),
					new Person("강호동",57)
				);
				
	
		
		
		
		
		
	}

}
