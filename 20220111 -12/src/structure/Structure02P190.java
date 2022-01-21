package structure;

public class Structure02P190 {
	
	// Person 내부의 정보를쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 : " + p.name + ",나이" + p.age + ",연락처" + p.pNum + ",번호" + p.uNum);
	}

	public static void main(String[] args) {
		// 사람을두 명 만들어보세요(a , b)
        Person pa = new Person();
        pa.name = "Jin";
        pa.age = 22;
        pa.pNum = "01027157255";
        pa.uNum = 243567;
        
        Person pb = new Person();
        pb.name = " Bin";
        pb.age = 25;
        pb.pNum = "01035645658";
        pb.uNum = 5658;
        	
        getInfo(pa);
        getInfo(pb);
        		
	}

}
