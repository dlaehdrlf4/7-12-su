package susudj;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		// 1993년 5월 5일을 Calendar 객체로 만들기
		Calendar meetDay = Calendar.getInstance();
		meetDay.set(Calendar.YEAR, 1993);
		meetDay.set(Calendar.MONTH, 6);
		meetDay.set(Calendar.DAY_OF_MONTH, 5);
		System.out.println(meetDay);
		// Date date = new Date(meetDay.getTimeInMillis());
		// System.out.println(date);
		Calendar toDay = Calendar.getInstance();
		long gap = toDay.getTimeInMillis() - meetDay.getTimeInMillis();
		System.out.println("제시카를 만나자" + (gap / 24 / 60 / 60 / 100) + "일 째 되는 날 입니다.");
	}

}
