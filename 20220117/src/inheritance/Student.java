package inheritance;


	
	// 상속 문법
	// 클래서 명칭 오른쪽에 <extends 부모 클래스 이름>을 적습니다
	// 이렇게 상속한 클래스는 부모, 자식클래가 하나의 객체 내부에
	// 공존하는 형태로 메모리에 생성됩니다.
	
	public class Student extends Person {
		// name , age
		// 공통속성 (이름 ,나이) 가 아닌 학생만의 개별적 특성 정의
		public int stuNum; // 학번
		
		// getStudentInFo() 메서드를 생성해주세요.
		// 이름, 나이 학번을 모드 콘솔에 찍어줍니다.
		public void getStudentInFo() {
			System.out.println("이름은 :" + name + "입니다 ,나이는 :" + age + "입니다 , 학번은 :" + stuNum + "입니다.");
		}
	}

	

	


