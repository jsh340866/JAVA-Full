package Ch06;

import java.util.Scanner;

public class C02WHILE {

	public static void main(String[] args) {

		// 2 - 9단 출력
//		int dan = 2;
//		while(dan < 10) {
//			System.out.println("\n=== " + dan + "단 시작 ===");
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			dan++;
//		}

		// N - 9 단 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("출력할 단을 입력하세요 >>> ");
//		int n = sc.nextInt();
//		int dan = n;
//		while(dan < 10) {
//			System.out.println("\n=== " + dan + "단 시작 ==="); 
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			dan++;
//		}
//		sc.close();

		// N - M 단 출력(N<M, N>=2 && N<=9, M>2 && M<10)
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("출력할 단을 입력하세요 >>> ");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int tmp = 0;
//
//		while ((n>=m) || (n<2 || n>9) || (m<=2 || m>=10)) {
//			System.out.printf("단을 다시 입력하세요 >>> ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//
//		int dan = n;
//		while(dan <= m) {
//			System.out.println("\n=== " + dan + "단 시작 ==="); 
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			dan++;
//		}
//
//		sc.close();

		// N - M 단 출력 거꾸로 9 x 9, 9 x 8 ...
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("출력할 단을 입력하세요 >>> ");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//	
//		while ((n>=m) || (n<2 || n>9) || (m<=2 || m>=10)) {
//			System.out.printf("단을 다시 입력하세요 >>> ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//
//
//		int dan = m;
//		while(dan >= n) {
//			System.out.println("\n=== " + dan + "단 시작 ==="); 
//			int i = 9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			dan--;
//		}
//
//		sc.close();

		// 1) 고정높이
		// *****
		// *****
		// *****
		// *****
//		int i = 0;
//		while (i < 3) {
//			int j = 0;
//			while (j < 5) {
//				System.out.printf("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}

		// 2)
		// 높이 : 4
		// *****
		// *****
		// *****
		// *****
//		Scanner sc = new Scanner(System.in);		
//		int h = sc.nextInt();
//		int i = 0;
//		while (i < h) {
//			int j = 0;
//			while (j < 5) {
//				System.out.printf("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
//		sc.close();
		// 3) 고정높이
		// *
		// **
		// ***
		// ****
//		int i = 1;
//		while (i < 5) {
//			int j = 0;
//			while (j < i) {
//				System.out.printf("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}

		// 4)
		// 높이 : 4
		// *
		// **
		// ***
		// ****
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 1;
//		while (i < h+1) {
//			int j = 0;
//			while (j < i) {
//				System.out.printf("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
//		sc.close();

		// 5)
		// 높이 : 4
		// ****
		// ***
		// **
		// *
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 1;
//		while (i < 5) {
//			int j = i;
//			while (j < 5) {
//				System.out.printf("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
//		sc.close();

		// 6)
		// 높이 : 4
		// *
		// ***
		// *****
		// *******
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 1;
//		while (i < 5) {
//			int j = 1;
//			while ((j/2) < i) {
//				System.out.printf("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
//		sc.close();

		// 7)
		// 높이 : 4
		// *******
		// *****
		// ***
		// *
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = h;
//		while (i > 0) {
//			int j = 1;
//			while ((j/2) < i) {
//				System.out.printf("*");
//				j++;
//			}
//			i--;
//			System.out.println();
//		}
//		sc.close();

		// 8) 고정높이
		// * 
		// *** 
		// ***** 
		// ******* 
		// ***** 
		// *** 
		// * 
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int i = 1;
		int k = 1;
		while (i < (h+1)) {
			int j = 1;
			while (j/2 < k) {
				System.out.printf("*");
				j++;
			}
			System.out.println();
			
			if(i<(h+1)/2) {
				k++;
			}
			else {
				k--;
			}

			i++;
		}
		sc.close();

//		int i = 1;      // 전체 반복 횟수 (1~7줄)
//		int starCount = 1; // 실제 찍을 별의 기준 (1->2->3->4->3->2->1)
//
//		while (i <= 7) {
//		    int j = 1;
//		    // 작성하셨던 j/2 < starCount 로직 그대로 활용!
//		    while ((j / 2) < starCount) {
//		        System.out.print("*");
//		        j++;
//		    }
//		    System.out.println();
//
//		    // 중간(4번째 줄) 전까지는 별을 늘리고, 그 뒤로는 줄여요
//		    if (i < 4) {
//		        starCount++;
//		    } else {
//		        starCount--;
//		    }
//		    i++;
//		}
		// 9)
		// 높이 : 7
		// *
		// ***
		// *****
		// *******
		// *****
		// ***
		// *

		// 10)
		// 높이 : 7
		// *******
		// *****
		// ***
		// *
		// ***
		// *****
		// *******

		// ==============================================================

		//6)
		//높이 : 4
		//   *
		//  ***
		// *****
		//*******

//		i(행)				j(공백)				k(별)											
//		0						0-2					0-0
//		1						0-1					0-2
//		2						0-0					0-4
//		3						x						0-6
//		----------------------------
//		i=0					j=0					k=0
//		i++					j++					k++
//		i<4					j<3-i				k<=i*2

//		int i = 0;
//		while (i < 4) {
//			int j = 0;
//			while (j < 3 - i) {
//				System.out.printf(" ");
//				j++;
//			}
//			int k = 0;
//			while (k <= i * 2) {
//				System.out.printf("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}

		//7)
		//높이 : 4
		//*******
		// *****
		//  ***
		//   *

		//8) 고정높이
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
		//9)
		//높이 : 7
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *	
		
		// 10)
		// 높이 : 7
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******
	}

}
