package accessmodifier;

public class Dog {// 정의부
	// 강아지의 정보를 자율적으로 3개 더 부여해주세요
	// String name는 고정입니다
	    private String name;
		private int age;
		private String kind;
		private String gender;
		
		
		
	

	// 생성자로 강아지 정보를 처리하시되
          public Dog(String n) {
	      name = n;
	      age = 10;
	      kind = "포메라니안";
	      gender = "암컷";
	      
}
          public void getInFo() {
        	  System.out.println(name + age + kind + gender);
          }
	// 이름은 무조건 입력받게 해주세요.
	public void timepasses() {
	    age++;
	// 수치 정보값이 변경되는 형태의 메서드 하나를 만들어주세요

          }
}