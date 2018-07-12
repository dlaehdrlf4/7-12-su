package susudj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		// 키보드로부터 한 줄을 입력받아서 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력");
		//한줄을 입력받는 객체
		//String msg = sc.nextln(); // 한줄을 입력받기 이것은 임 동 길 해도 정상적으로 띄워쓰기 된 임 동 길 이출력된다.
		String msg = sc.next(); // 이것은 공백만 와도 끝났다고 생각함 그래서 임 동 길 이런식으로 띄워쓰기하면 임밖에 안나온다. // 공백단위로 구분해서 입력받기
		System.out.println(msg);
		
		//문자열로 부터 받기
		sc = new Scanner("Hello java"); //이렇게 하면 split 역할도 해줌  안에 있는 내용을 읽어 올수도 있다.
		System.out.println(sc.next());
		System.out.println(sc.next());
		sc.close();
		//File 객체 만들기
		File f = new File("C:\\JavaProgramming\\source\\0706sample\\src\\sample\\Sample.java");
		//파일과 연결되는 스캐너 객체 만들기
		try {
			sc = new Scanner(f);
			// 데이터가 있을때까지 읽기
			// 파일은 있는데 내용을 못 읽는 영우는 2가지 경우인데
			// 구분문자가 없는 경우이고 한글 인코딩이 서로 다른 경우 입니다.
			// 한글 인코딩이 잘못되면 글자가 깨지는게 아니고 scanner는 읽지를 못합니다.
			// 공백 문자를 찾아야 하는데 인코딩이 다르면 공백문자의 코드 값이 다릅니다.
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		// 스캐너를 사용하면 마지막에 닫아 주어야 합니다.
	//	sc.close();

	}

}
