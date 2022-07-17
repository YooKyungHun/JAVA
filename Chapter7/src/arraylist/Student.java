package arraylist;

import java.util.ArrayList;

public class Student {

	private int studentID;					 // id
	private String studentName;				 // name
	private ArrayList<Subject> subjectList;  // 학생의 수강목록
	// ArrayList 의 기본 자료형은 Object 인데, Subject 로 바꿔줌.
	
	
	public Student(int studentID, String studentName) {
	// Student 가 생성될때, ID 와 name 이 있어야함.
		this.studentID = studentID;
		this.studentName = studentName;
	
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
 		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println("학생 " + studentName + "님의 " +
					subject.getName() + " 과목의 성적은 " + 
					subject.getScorePoint() + " 점입니다.");
		}
		System.out.println("학생 " + studentName + "님의 총점은 " +
				total + "점 입니다.");
	}
}
