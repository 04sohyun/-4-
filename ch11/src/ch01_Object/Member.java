package ch01_Object;

//thread, collection, network, file�����
public class Member {
  public String id;

public Member(String id) {
	this.id = id;
}

//object�κ��� ��ӹ��� equals�޼ҵ带 �������Ͽ� ������ ���� ���� �����
@Override
public boolean equals(Object obj) {
	//�񱳽� ���� Ÿ���� �ƴϸ� false
	if(obj instanceof Member) {
		//���� Ÿ���̸� id������ ���� ��� true/false
		return this.id.equals(((Member)obj).id);
	}
	return false;
}
  
  
}