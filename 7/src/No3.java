import java.util.HashMap;
import java.util.Scanner;
import java.util.InputMismatchException;

class NationsNum {
	HashMap<String, Integer> nations = new HashMap<String, Integer>();
	Scanner s = new Scanner(System.in);
	
	void setNations() {
		while(true) {
			System.out.print("���� �̸�, �α� >> ");
			
			String str = s.next();
			if(str.equals("�׸�")) {
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
			System.out.print("�α� �˻� >> ");
			try {
				str = s.next();
				if(str.equals("�׸�")) {
					break;
				}
				in = nations.get(str);
				System.out.println(str + "�� �α��� " + in);
			}
			catch(InputMismatchException e) {
				System.out.println(str + "����� �����ϴ�");
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
