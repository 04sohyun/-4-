package workout;

public interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}
class OracleDao implements DataAccessObject{
	@Override
	public void select() {System.out.println("Oracle DB에서 검색");}
	@Override
	public void insert() {System.out.println("Oracle DB에서 삽입");}
	@Override
	public void update() {System.out.println("Oracle DB에서 수정");}
	@Override
	public void delete() {System.out.println("Oracle DB에서 삭제");}
}

class MySqlDao implements DataAccessObject{
	@Override
	public void select() {System.out.println("MySql DB에서 검색");}
	@Override
	public void insert() {System.out.println("MySql DB에서 삽입");}
	@Override
	public void update() {System.out.println("MySql DB에서 수정");}
	@Override
	public void delete() {System.out.println("MySql DB에서 삭제");}
}