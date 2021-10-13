package workout;

public interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}
class OracleDao implements DataAccessObject{
	@Override
	public void select() {System.out.println("Oracle DB���� �˻�");}
	@Override
	public void insert() {System.out.println("Oracle DB���� ����");}
	@Override
	public void update() {System.out.println("Oracle DB���� ����");}
	@Override
	public void delete() {System.out.println("Oracle DB���� ����");}
}

class MySqlDao implements DataAccessObject{
	@Override
	public void select() {System.out.println("MySql DB���� �˻�");}
	@Override
	public void insert() {System.out.println("MySql DB���� ����");}
	@Override
	public void update() {System.out.println("MySql DB���� ����");}
	@Override
	public void delete() {System.out.println("MySql DB���� ����");}
}