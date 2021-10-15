package ch02_Objects.copy;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.sno.compareTo(o2.sno);//"홍길동","홍길이" 앞글자씩 비교 동>이
				
	}

}

class Student{
	String sno;

	public Student(String sno) {
		this.sno = sno;
	}
}