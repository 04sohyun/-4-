package workout;

public interface Soundable {
	String sound();
}

class Cat implements Soundable{

	@Override
	public String sound() {
		 String result="�߿�";
		return result;
	}
}
class Dog implements Soundable{

	@Override
	public String sound() {
		String result = "�۸�";
		return result;
	}
}