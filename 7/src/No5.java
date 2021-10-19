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
		System.out.println("이름:" + name);
		System.out.println("학과:" + major);
		System.out.println("학번:" + id);
		System.out.println("학점평군:" + score);
	}
}

public class No5 {

	public static void main(String[] args) {
		String name, major;
		int id;
		double score;
		Scanner s = new Scanner(System.in);
		ArrayList<Student> arrList = new ArrayList<Student>();
		
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		
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
