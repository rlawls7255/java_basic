package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연본을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요
		// 생성한 객체의 정보를 getInFo()를 이용해 콘솔에도 같이 찍어주세요
		Salaryman a1 = new Salaryman();
		a1.name = "김진";
		a1.age = 22;
		a1.salary = 200000000;
		a1.getSalaryInFo();
		
		Student s1 = new Student();
		s1.name = "나래";
	    s1.age = 17;
	    s1.stuNum = 21;
	    s1.getStudentInFo();

	}

}
