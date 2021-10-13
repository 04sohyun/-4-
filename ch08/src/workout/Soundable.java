package workout;

public interface Soundable {
	String sound();
}

class Cat implements Soundable{

	@Override
	public String sound() {
		// String result="�߿�";
		//return result;
		return "�߿�";
	}
}
class Dog implements Soundable{

	@Override
	public String sound() {
		//String result = "�۸�";
		//return result;
		return "�۸�";
	}
}