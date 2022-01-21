package construcor;

public class Main03P204 {

	public static void main(String[] args) {
		Webtoon w1 = new Webtoon("나혼자만 레벨업" , "김진");
		Webtoon w2 = new Webtoon("갓 오브 하이스쿨", " 김빈");
		
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.completeWebtoon();
		w1.getInFo();
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.getInFo();
	}

}
