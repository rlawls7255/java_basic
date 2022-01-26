package static2;

public class Asean {
	// 출석점수(check), 중간고사(midterm), 기말고사(fianlterm)
	// 변수를 설정해주세요.
	// 위 변수들은 개별 객체가 따로따로 관리합니다.
	private int check;
	private int midterm;
	private int fianlterm;
	
	// 공용 발표점수인 presentationScore를 static로 만들어주세요.
	// 이 점수는 19점입니다.
	public static int presentationScore = 19;
	
	
	// 생성자는 객체 생성시 출석, 중간고사, 기말고사 점수만
	// 받아서 수치를 입력해줍니다.
	public Asean(int check,int midterm,int fianlterm) {
		this.check = check;
		this.midterm = midterm;
		this.fianlterm = fianlterm;
	}
	// 일반 메서드로 showAseanInFo()를 생성해주시되
		// 성적 전체를 콘솔에 조회하게 해주세요.
		// 중간고사 :, 기말고사:,
	public void showAesanInFo() {
		System.out.println("출석 점수 : " +this.check+ "중간 고사 :" + this.check+ "기말 고사 :" +  this.midterm);
		
	}
	
	// presentationScore는 private으로 전환될 경우
	// main 지역에서 다이렉트로 조회가 불가능합니다.
	// Asean을 new 키워드로 만들지 않고도
	// private PersentationScore를 콘솔에 조회가능하도록
	// 조치를 취해보세요
	public static int getpresentationScore() {
		return presentationScore;
	}
	
}
