package Ch03;

import java.util.Arrays;

public class C02ArrayMain {

	public static void main(String[] args) {
		//얕은복사(주소복사)
		int arr1[] = {10,20,30};
		int arr2[];
		arr2 = arr1;
		arr1[0] = 100;
		
		Arrays.stream(arr1).forEach((el)->{System.out.println(el);});
		System.out.println("------------------");
		Arrays.stream(arr2).forEach((el)->{System.out.println(el);});

	}

}
