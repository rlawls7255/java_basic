import java.util.Scanner;

public class BREAKq01p120 {

	public static void main(String[] args) {
		// Scanner 로 정수를 입력받으세요
		// 1~n 까지 차곡차곡 순서대로 더해나갔을때
		// 1부터 몇까지 더해야 입력된 정수를 초과하는지 계산해주는
		// 프로그램을 작성해주세요
		// ex) 40 입력시 1+2+3+4+5+6+7+8+9 =45
		// 1부터 9까지 더하면 40을 초과해 총합이 45가 됩니다. 라고 출력되기 해주세요
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int a = scan.nextInt();
		// 바퀴수(1바퀴 2바퀴 3바퀴... 형식으로 1부터 시작)
		int count = 1;
		// 총합(0부터 시작해서 누적된 값을 구함)
		int total = 0;
		// 몇바퀴를 돌아야 하는지 모르니 무한루프로 시작
		while(true) {
			// n바퀴째일때, 그 바퀴수를 더함
			total += count;
			if(total > a ) {
				System.out.println("목표값 :"+a);
				System.out.println("총 합 :"+total);
				System.out.println("몇 까지 더했나? :"+count);
				break;
			}
			// 다 돌았으면 바퀴수 증가
			count++;
		}
		System.out.println("1부터"+count+"까지 더하면" + a +"을 초과해 총합이"+ total +"가 됩니다.");
	}
}
				

	


