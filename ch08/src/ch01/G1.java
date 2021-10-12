package ch01;

//인터페이스 선언
public interface G1 {
	int a = 10;//static final 생략
	void a();//public abstract 생략
}
//구현
class G2 implements G1{
	@Override
	public void a() {
		System.out.println("aa");
	}
}
class G3 implements G1{
	@Override
	public void a() {
		System.out.println("bb");
	}
	
}