package static2;

public class Main01P276 {

	public static void main(String[] args) {
		// Asean 조원 생성 없이 발표점수를 콘솔에 찍어보세요.
		System.out.println(Asean.getpresentationScore());
		
		// Asean 조원 4명을 자율적으로 만든 다음, 각 인원의 성적을 조회해주세요.
		Asean a1 = new Asean(20,50,40);
		Asean b1 = new Asean(60,51,94);
		Asean c1 = new Asean(54,94,85);
		Asean d1 = new Asean(81,64,95);
		a1.showAesanInFo();
		b1.showAesanInFo();
		c1.showAesanInFo();
		d1.showAesanInFo();

	}

}
