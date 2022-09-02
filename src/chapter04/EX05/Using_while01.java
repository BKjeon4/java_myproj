package chapter04.EX05;

public class Using_while01 {

	public static void main(String[] args) {
		// while (조건) {
		// 		실행문 ;
		// }
		
		// while 반복 횟수를 알 수 없는 경우 사용
		// for 반복 횟수를 알 수 있는 경우 사용
		
		//	-- 초기값 선언을 반드시 while 문 밖에서 선언을 해야 한다.
		//		<while 문 내에서 선언시 무한 루프>
		// 	-- 증가값은 while 문 내에서 선언을 함 <증가값을 선언하지 않으면 무한루프>
		
		
		
		// 1. while 문에서 반복 횟수가 0 인 경우
		System.out.println("===========반복 횟수 0===========");
		int a = 0;	// 변수의 초기값은 while 밖에서 선언
		while (a < 0) {		//false
			System.out.println(a+ " ");		//조건이 True 일때만 실행
		}
		
		// 2. while 문에서 반복 횟수가 1번인 경우
		System.out.println("==========반복 횟수 1============");
		a=0;
		while (a == 0) {
			System.out.print(a + "");
			System.out.println();
			break;
		}
		
		
		System.out.println("==========반복 횟수 1 (증가 값을 사용)============");
		a=0;
		while (a == 0) {
			System.out.print(a + "");
			a++;
		}
		
		System.out.println();		//Enter
		System.out.println(" ============= 반복 횟수 10 =============");
		
		a = 0 ;				//초기값 : while 밖에서 선언
		while (a <10) {
			System.out.print(a + " ");
			a ++;			//증가값은 while 문 내에서 처리 (탈출할 수 있는 루트를 만들어 주는 것)
		}
		
		System.out.println();
		System.out.println("======= 초기 값을 while 문 내에 넣는 경우 : 무한루프 =========");
		
		
		while (a <10) {
			a = 0;			// 초기화 값을 while 문 내에서 선언하면 무한루프
			System.out.print(a + " ");
			a ++;			//증가값은 while 문 내에서 처리
		}
		
		// while 문은 조건을 생략할 수 없음
		// for 문은 조건을 생략할 시 무한루프
		// while 문에서 무한루프를 돌릴 때 조건에 true
		
		System.out.println();
		System.out.println("=============================");
		
		a=0;
		boolean b;
		b=true;
		
		while (b) {
			System.out.print(a + " ");
			a++ ;
			if (a > 200) {
				break;
			}
		}
		

	}

}
