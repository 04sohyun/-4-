package workout;
/* ���� �������̽� */
public class Ex5_1 {
	public static void main(String[] args) {
		//�� ���α׷������� 1ȸ������ �������̽��� �����ؼ� ��üŬ������ ����ϰ� �����ڴ�.
		//�̸����� ��üŬ������ ���� �������̽��� ���� �� ���
		//�������̽��� ���� �̸����� �����ڸ� ȣ���Ͽ� �����ϸ� ��üŬ������ ����
		//������ �� ��ü�� ActionŸ�Կ� ����
		Action action=new Action() {//�ڽ�(��üŬ������ ��ü)�� �����ϰ� �θ�Ÿ�Կ� ����(promotion)
			@Override
			public void work() {//��üŬ�������� �����ǿ� ����
				System.out.println("����۾�");
			}
		};
		action.work();
		
		//�����������̽�(anonymous inner type)
		action = new Action() {
			@Override
			public void work() {
				System.out.println("��۴ޱ�");
			}
			
		};
	}

}
