import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name, major;
	int id;
	double score;
	
	Student(String name, String major, int id, double score){
		this.name=name;this.major=major;this.id=id;this.score=score;
	}
	
	void showStudent() {
		System.out.println("�̸�:" + name);
		System.out.println("�а�:" + major);
		System.out.println("�й�:" + id);
		System.out.println("������:" + score);
	}
}

public class No5 {

	public static void main(String[] args) {
		String name, major;
		int id;
		double score;
		Scanner s = new Scanner(System.in);
		ArrayList<Student> arrList = new ArrayList<Student>();
		
		System.out.println("�л� �̸�, �а�, �й�, ��������� �Է��ϼ���.");
		
		for(int i=0;i<4;i++) {
			System.out.print(">>");

			name = s.next();
			major = s.next();
			id = s.nextInt();
			score = s.nextDouble();
			
			Student stu = new Student(name,major,id,score);
			
			arrList.add(stu);
		}
		
		for(int i=0;i<4;i++) {
			System.out.println("--------------------------");
			Student stu = arrList.get(i);
			
			stu.showStudent();
		}
	}
}
