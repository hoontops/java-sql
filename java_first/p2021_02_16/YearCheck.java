package p2021_02_16;

import java.util.*;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		GregorianCalendar y = new GregorianCalendar();
//		Calendar y = new GregorianCalendar();	// 레퍼런스 형변환 : 업캐스팅

		if (y.isLeapYear(year)) {
			System.out.println(year + "은 윤년입니다");
		} else {
			System.out.println(year + "은 평년입니다");
		}

	}

}
