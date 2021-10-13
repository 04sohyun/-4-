package workout;

public interface Soundable {
	String sound();
}

class Cat implements Soundable{

	@Override
	public String sound() {
		// String result="具克";
		//return result;
		return "具克";
	}
}
class Dog implements Soundable{

	@Override
	public String sound() {
		//String result = "港港";
		//return result;
		return "港港";
	}
}