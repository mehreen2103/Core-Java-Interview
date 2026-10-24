package OOP.abstracts;

abstract class BaseDTO {
	
	public int id = 101;
	
	public abstract String getTableName();
	
	public abstract String getUniqueKey();
	
}

class UserDTO extends BaseDTO{

	@Override
	public String getTableName() {
		
		return "st_user";
	}

	@Override
	public String getUniqueKey() {
		
		return "loginId";
	}
	
	
}
