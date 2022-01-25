package heterogeneous;

public class HeterogeneousArray {

	public static void main(String[] args) {
		// int []에는 정수만 넣을 수 있음.
		int [] iArr = {1,2,3,4,5,6,7,8,9,10};

		
		// iArr를 향상된 for문으로 출력해보세요
		for(int abcd : iArr) {
			System.out.println(abcd);
		}
		
		// 여러 자료를 받을 수 있도록  모든 클래스의 부모니 object로 배열 생성
		// opject는 다향성의 원리에 의해 모든 자료를 저장받을 수 있다.
		Object[] oArr = { "a" , "b" , 1 , 2 , 3.0 , 5.1};
		// 향상된 for문으로 출력해보세요
		for(Object abc : oArr) {
			System.out.println(abc);
		}
	}

}
