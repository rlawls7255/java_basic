package inheritance;

public class Main01P254 {

	public static void main(String[] args) {
		// Student가 Person을 상속했기 떄문에
		// Student가 Person의 자원을 사용할 수 있습니다.
		Student s1 = new Student();
		s1.name = "김진";
		s1.age = 22;
		s1.stuNum = 56;
		
		s1.getInFo();
		s1.getStudentInFo();
		
		// Student를 하나 더 만들어주시고
		// 코드는 복붙해서 보내주시고
		// 메모리 구조는 그림으로 그려서 캡쳐해서 보내주세요.
		Student s2 = new Student();
		s2.name = "성재";
		s2.age = 20;
		s2.stuNum = 1;
		s2.getInFo();
		s2.getStudentInFo();

		Salaryman a1 = new Salaryman();
		a1.name = "나";
		a1.age = 32;
		a1.salary = 20000000;
		a1.getSalaryInFo();
	}

}
