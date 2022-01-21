package structure;

public class ClassMain01P196 {
	
	// Personclass를 조회할 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass 내부에 필요한 메서드를 작성해놨기 때문입니다.


	public static void main(String[] args) {
		// 사람 두명 만들어보세요(PersonClass)
		
		PersonClass p1 = new PersonClass();
		p1.name = "김진";
		p1.age = 22;
		p1.pNum = "01027157255";
		p1.uNum = 243567;
		p1.glasses = false;
		
		PersonClass p2 = new PersonClass();
		p2.name = "김빈";
		p2.age = 25;
		p2.pNum = "01035645658";
		p2.uNum = 5658;
		p2.glasses= true;
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
		// *힌트 getInfo에 소속은?
		p1.getInfo();
		p2.getInfo();

	}

}
