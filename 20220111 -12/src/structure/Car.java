package structure;

public class Car {
	// 멤버 변수
	// 자동차 모델, 가격, 주인
	
	public String model;// 자동차 모델
	public String price;// 가격
	public String owner;//주인
	
	
	public void getInFo() {
		System.out.println("자동차 모델 :" + model + ",자동차 가격 :" + price + ", 자동차 주인 : " + owner);
	}
	// 멤버 메서드
	// getInFo()로 모델, 가격, 주인에 대해 조회하도록 작성해주세요.

}
