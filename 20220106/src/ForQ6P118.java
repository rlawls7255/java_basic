
public class ForQ6P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다
		// 아래와 같은 별을 찍을 수 있도록 중첩 반복문을사용해 코드를 작성해주세요
		//*
		//**
		//***
		//**** 
		//중첩 반복문의 어느 지점이 다음줄로 내리고, 어느 부분이 별을 나열하는지 생각해보세요
		// 별 개수가 점점 늘어나는데 점점 숫자카 커지는 변수( j, i 가있다) j=j는 불가능하므로 j=i
		for(int i =1; i <5; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
				
		}
			System.out.println();
	}
}
}