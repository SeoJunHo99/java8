package java8;

public class Day0208 {

	public static void main(String[] args) {
		int dice = 0;	//선언과 초기화를 하면 차후에 오류를 줄일 수 있습니다.
		dice = (int)(Math.random() * 6) + 1;	//Math.random()은 0보다 크거나 같고 1보다 작은 실수(double)를 생성
		//형변환은 사칙연산보다 우선합니다.
		//dice 0~5 => 1~6
		System.out.println(dice);
	}

}
