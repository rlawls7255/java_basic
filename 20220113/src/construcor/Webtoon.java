package construcor;

public class Webtoon {
       // 웹툰 이름 name; 연재 횟수 series, 작가 painter, 완결여부 complete
	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	// 생성자를 만들어주세요
	// 모든 웹툰의 연재횟수는 1로 시작합니다
	// 모든 연재작은 처음에 완결되지 않은 상태로 시작합니다
	// 작가와 제목은 그때그때 입력받아 생성합니다.
	
	public Webtoon(String n , String p) {
		series = 1;
		complete = false;
		name = n;
		painter = p;
	}
  	public void getInFo() {
  		System.out.println("웹툰의 이름은 : " + name +  "연재 횟수는 : " + series + "작가는 :" + painter + "완결 여부는 : " + complete + "입니다" );
  	
	
	}
  	public void uploadWebtoon() {
  		series ++;
  	}
  	public void completeWebtoon() {
  		complete = true;
  	}
  	
  	
	
}
