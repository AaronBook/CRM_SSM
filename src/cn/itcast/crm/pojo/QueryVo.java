package cn.itcast.crm.pojo;

public class QueryVo {

	private String cust_username;
	private String cust_type;
	public String getCust_username() {
		return cust_username;
	}
	public void setCust_username(String cust_username) {
		this.cust_username = cust_username;
	}
	public String getCust_type() {
		return cust_type;
	}
	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}
	@Override
	public String toString() {
		return "QueryVo [cust_username=" + cust_username + ", cust_type=" + cust_type + "]";
	}
	
}
