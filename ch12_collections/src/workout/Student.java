package workout;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	} 

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		return this.studentNum==((Student)obj).studentNum;
	}


	
	
	
}
