package susudj;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class LogMain {

	public static void main(String[] args) {
		// 로그 파일의 내용을 읽을 수 있는 Scanner 만들기
		File f = new File("C:\\Users\\503-25\\Desktop\\log.txt");
		// 중복없이 하려고 한다.
		HashSet<String> set = new HashSet<>();
		try {
			//파일의 내용을 읽을 Scanner 인스턴스 생성
			Scanner sc = new Scanner(f);
			//읽을 다음 줄이 있을때 까지 수행
			int sum = 0; // 합계 변수 선언
			while (sc.hasNextLine()) {
				/* System.out.println(sc.nextLine()); */
				// 한줄 읽기
				String temp = sc.nextLine();
				// 공백으로 분할하기
				String[] ar = temp.split(" ");
				//10번째 데이터 확인
				//System.out.println(ar[9]);
				//10번째 문자열을 정수로 변환해서 sum에 더하기
				sum = sum + Integer.parseInt(ar[9]);
			}
			System.out.println("트래픽 합계 : " + sum); //합계 출력
			sc.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
