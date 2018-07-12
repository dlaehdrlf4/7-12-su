package susudj;

public class MapMain2 {

	public static void main(String[] args) {
		//농구 팀 별 선수 명단을 배열로 만들기
		String [] db = {"김주성","허웅","박지헌"};
		String [] sk = {"김선형","김민수","헤인즈"};
		String [] kcc = {"전태풍","하승진","이정현"};
		String [] samsung = {"김태술","김승현","라틀리프"};
		
		//String 배열의 배열로 묶기
		String [][] players = {db,sk,kcc,samsung};
		
		
		//이차원 배열의 데이터 출력
		//큰 배열에 포함된 작은 배열의 데이터 개수만큼 반복
		for(int i =0 ; i<players.length;i=i+1) {
			if(i==0) {
				System.out.print("db:" + "\t");
			} else if(i==1) {
				System.out.print("sk:" + "\t");
			} else if(i==2) {
				System.out.print("kcc:" + "\t");
			} else if(i==3) {
				System.out.print("samsung:" + "\t");
			}
			//작은 배열을 순서대로 가져오기
			String [] imsi = players[i];
			//작은 배열의 데이터 개수만큼 반복
			for(int j =0; j<imsi.length ; j=j+1) {
				System.out.print(imsi[j] + "\t");
			}
			System.out.println("");
		}
		

	}

}
