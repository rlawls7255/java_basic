
public class ContinueQ2P123 {

	public static void main(String[] args) {
		// 다음은  학생들의 과목별 성적입니다
		// math = 96, 23, 52 ,82 ,72 ,31 ,58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
        // math 평균점수를 내주시되, 합격자 평균만 내주세요
		// 합격점수는 60점 이상입니다
		
		int math[] = {96 ,23 ,52 ,82 ,72 ,31 ,58};
		int mathtotal = 0;
		int goal =0;
		
		for(int a : math) {
			if(a > 60) {
				mathtotal +=a;
				goal += 1;
				continue;
		}
			
	}
		System.out.println("math 시험 합격자들의 평균을 나타내시오.");
		System.out.println(mathtotal);
		System.out.println("합격자들의 평균은"+ mathtotal / goal + "입니다.");

}
}