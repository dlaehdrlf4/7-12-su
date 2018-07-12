package susudj;

import java.util.HashMap;
import java.util.Set;

public class Struc {

	public static void main(String[] args) {
		//HashMap은 kEY의 순서를 알수 없음
		HashMap <String,Object> map = new HashMap<>();
		map.put("ha", "아이린");
		map.put("age", 28);
		map.put("company","yg");
		
		//전체를 한꺼번에 출력 - toString이 재정의 되어있음
		System.out.println(map);
		//순서에 상관없이 항목별로 출력
		System.out.println("-------------------");
		Set<String> keys = map.keySet();
		for(String s : keys) {
			System.out.println(map.get(s));
		}
		
	}

}
