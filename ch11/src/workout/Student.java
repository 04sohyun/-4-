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
	public boolean equals(Object obj) {//??ü?? promotion
		if(obj instanceof Student) {//??????
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {//casting
				return true;
			}
		}
		return false;
	}
	
	
}
