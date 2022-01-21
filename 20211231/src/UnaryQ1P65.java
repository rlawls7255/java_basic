
public class UnaryQ1P65 {

	public static void main(String[] args) {
		// int a에 15를 담은 다음 후위- 전위 순으로 --를 Unary019P65처럼 사용해서
		// 1씩 차감하고 콘솔에 찍는것을 반복해주세요
		// 단, 실행 로직은 Urany01P65에서 그랬듯 주석으로 하단에 풀어서 작성까지 해주세요
		int a = 15;
		
		System.out.println(--a);// 전위수식 실행전에 먼저 a값(15)에서 1 감소
		// a값을 먼저 1감소시킴 : a(15) -1
		// 감소된 값을 a(14)를 콘솔에 찍음 sysout(a(14))
		
		System.out.println(a);// a값은 1 감소된 채로 유지 (14)
		
		System.out.println(a--);// 후위수식 a값(14)를 출력 후 1 감소
		// a값을 출력한 후 1 감소시킴 : a(14) - 1
		// 감소전 a값(14)을 콘솔에 찍은 후 감소
		
		System.out.println(a);// a값은 1 감소된 채로 유지 (13)
		

	}

}
