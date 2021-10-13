package workout;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		
		//dbWork�� �Ű������� DataAccessObject�� �����������̽��� �����Ͽ� �ѱ�
		dbWork(new DataAccessObject() {
			@Override
			public void select() {
				System.out.println("��ȸ");
			}
			@Override
			public void insert() {
				System.out.println("����");
			}
			@Override
			public void update() {
				System.out.println("����");
			}
			@Override
			public void delete() {
				System.out.println("����");
			}
		});//dbWork()��
	}
}
