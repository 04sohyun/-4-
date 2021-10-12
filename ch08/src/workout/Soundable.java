package workout;

public interface Soundable {
	String sound();
}

class Cat implements Soundable{

	@Override
	public String sound() {
		 String result="具克";
		return result;
	}
}
class Dog implements Soundable{

	@Override
	public String sound() {
		String result = "港港";
		return result;
	}
}