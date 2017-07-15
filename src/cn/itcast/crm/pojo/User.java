package cn.itcast.crm.pojo;

public class User {

	private Long uid;
	private String username;
	private String nickname;
	private String password;
	private String phoneCheckCode;
	private String checkCode;
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhoneCheckCode(String phoneCheckCode) {
		this.phoneCheckCode = phoneCheckCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	public Long getUid() {
		return uid;
	}
	public String getUsername() {
		return username;
	}
	public String getNickname() {
		return nickname;
	}
	public String getPassword() {
		return password;
	}
	public String getPhoneCheckCode() {
		return phoneCheckCode;
	}
	public String getCheckCode() {
		return checkCode;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", nickname=" + nickname + ", password=" + password
				+ ", phoneCheckCode=" + phoneCheckCode + ", checkCode=" + checkCode + "]";
	}
	
	
	
}
