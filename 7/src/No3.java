import java.util.HashMap;
import java.util.Scanner;
import java.util.InputMismatchException;

class NationsNum {
	HashMap<String, Integer> nations = new HashMap<String, Integer>();
	Scanner s = new Scanner(System.in);
	
	void setNations() {
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			
			String str = s.next();
			if(str.equals("그만")) {
				break;
			}
			Integer in = s.nextInt();
			
			nations.put(str, in);
		}
	}
	
	
	void searchNations() {
		String str = null;
		Integer in;
		while(true) {
			System.out.print("인구 검색 >> ");
			try {
				str = s.next();
				if(str.equals("그만")) {
					break;
				}
				in = nations.get(str);
				System.out.println(str + "의 인구는 " + in);
			}
			catch(InputMismatchException e) {
				System.out.println(str + "나라는 없습니다");
			}
			
		}
	}
	
	void run() {
		setNations();
		searchNations();
		s.nextLine();
	}
}

public class No3 {

	public static void main(String[] args) {
		NationsNum nn = new NationsNum();
		
		nn.run();
	}

}
