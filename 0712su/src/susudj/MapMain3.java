package susudj;

import java.util.HashMap;

public class MapMain3 {
	public static void main(String[] args) {
		// 농구 팀 별 선수 명단을 배열로 만들기
		String[] db = { "김주성", "허웅", "박지헌" };
		String[] sk = { "김선형", "김민수", "헤인즈" };
		String[] kcc = { "전태풍", "하승진", "이정현" };
		String[] sam = { "김태술", "김승현", "라틀리프" };

		// 동일한 의미를 갖는 배열들을 묶을 때 바로 배열이나 리스트로 묶는 것은 바람직하지 않습니다.
		// 배열이나 리스트는 인덱스를 가지고 구분을 하기 때문에 의미를 부여하지 못합니다.
		// 배열이나 리스트를 다시 배열이나 리스트로 묶을때는 먼저 Map으로
		// 의미를 부여해서 묶은 다음 다시 배열이나 리스트로 묶으라고 합니다.
		
		HashMap<String,Object> map = new HashMap<>();
		map.put("team", "동부");
		map.put("data", db);
		
		HashMap<String,Object> map1 = new HashMap<>();
		map1.put("team", "에스케이");
		map1.put("data", sk);
		
		HashMap<String,Object> map2 = new HashMap<>();
		map2.put("team", "케이시시");
		map2.put("data", kcc);
		
		HashMap<String,Object> map3 = new HashMap<>();
		map3.put("team", "삼성");
		map3.put("data", sam);
		
		//HashMap 배열
		HashMap [] players = {map,map1,map2,map3};//맵을 썻을 때 데이터를 바꾸는 부분을 바꾸지만 출력하는 부분은 안바꿔줘도 된다.
		
		for(int i =0 ; i<players.length; i=i+1) {
			HashMap temp = players[i];
			//팀 이름 출력
			System.out.print(temp.get("team") + "\t");
			//선수 명단 가져오기
			//출력할 때는 get 한 데이터를 형변환하지 않지만
			//저장을 하거나 사용을 할 때는 원래의 자료형으로 강제 형 변환을 해서 사용합니다.
			String [] imsi = (String [])temp.get("data");
			for(int j=0;j<imsi.length;j=j+1) {
				System.out.print(imsi[j] + "\t");
			}
			System.out.println("");
		}
		
	}
}