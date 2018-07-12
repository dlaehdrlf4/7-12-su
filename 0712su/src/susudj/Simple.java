package susudj;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Simple {

	public static void main(String[] args) {
		Date date = new Date();
		int money = 5000000;
		//0000년 00월 00일 요일 00시 00분 00초 형식으로 출력
		SimpleDateFormat sss = new SimpleDateFormat("yyyy년 MM월 dd일 EEE a hh시 mm분 ss초"); // EEE이것은 요일이 안나오고 EEEE는 요일이 나온다 이것은 영어로 되있어서 E를 한번만 쓰지말고 EEE써야한다.
		String msg = sss.format(date);
		System.out.println(msg);
		
		
		//\5,000,000로 출력
		DecimalFormat df = new DecimalFormat("\u00A4 #,##0");
		msg = df.format(money);
		System.out.println(msg);
		//format들어가면 문자출력이라고 생각
	}

}
