package susudj;

import java.util.StringTokenizer;

public class TokenMain {

	public static void main(String[] args) {
		String m = "i love you yeeun";
		
		//m를 공백 단위로 분할 해서 출력
		//1. split 메소드 이용
		String [] ar = m.split(" ");
		for(String token : ar) {
			System.out.println(token);
		}
		System.out.println("======================");
		StringTokenizer st = new StringTokenizer(m," ");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		String data = "30,40,50,60";
		//data를 , 단위로 분할해서 합계를 구하기
		String [] ar1 = data.split(","); //했는데 안되면 \\ 두번 붙여주면 된다. 분할 시킬 때 ,을 뺏을 때 분할이 ,단위로 분할을 하지 않아 예러가 생겼다.NumberFormatException 30 40 이걸 한꺼번에 분할하기 떄문
		int sum = 0;
		for(String ms : ar1) {
			sum = sum + Integer.parseInt(ms);
		}
		System.out.println("합계" + sum );
	}

}
