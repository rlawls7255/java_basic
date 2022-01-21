
public class test {

	public static void main(String[] args) {
		// i를 증가하게 할거면
		// j포문에 j <?-i형식으로 점점 커지는 i를 빼주면 된다.
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
