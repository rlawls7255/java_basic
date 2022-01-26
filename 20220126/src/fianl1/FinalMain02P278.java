package fianl1;

public class FinalMain02P278 {
	public static void main(String[] args) {
	

	// 일반 숫자를 이용한 출력요소
	System.out.println("전사의 체력 :" + 50);
	System.out.println("몬스터의 경험치 :" + 20);
	
	// 자주 사용될 고정값은 아래와 같이 상수 처리해서
	// 코드에 대입을 해줍니다.
	// 이러면 변수명만으로도 어떤 의미를 가진 수치인지
	// 바로 유추가 가능하기 떄문에 코드 가독성이 높아집니다.
	// final이 붙은 변수는 대문자로만 적으며, 단어사이는_로 연결합니다.
	final int Warrior_HP= 50;
	final int Monster_EXP = 25;
	
	System.out.println(Warrior_HP);
	System.out.println(Monster_EXP);
	
	// final이 붙은 변수를 굳이 쓰는 2번째 이유는 값을 일괄적으로
	// 바꿔주기 편하기 떄문입니다.
	// 패치가 되어 전사체력은 +5, 몬스터 경험치도 +5 되었습니다. 고쳐주세요.
	System.out.println(Warrior_HP);
	System.out.println(Monster_EXP);
	System.out.println(Warrior_HP);
	System.out.println(Monster_EXP);
	System.out.println(Warrior_HP);
	System.out.println(Monster_EXP);
	System.out.println(Warrior_HP);
	System.out.println(Monster_EXP);

}
}