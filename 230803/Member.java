package JavaProject;

public class Member {
	int member_id;
	String name;
	String password;
	String role;
	
	public Member(int member_id, String name, String password, String role) {
		this.member_id = member_id;
		this.name = name;
		this.password = password;
		this.role = role;
	}

	// 기본 생성자
    public Member() {
    	
    }
    

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	 
}

