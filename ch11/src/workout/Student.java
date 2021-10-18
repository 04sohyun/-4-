package workout;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {//객체의 promotion
		if(obj instanceof Student) {//다형성
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {//casting
				return true;
			}
		}
		return false;
	}
	
	
}
