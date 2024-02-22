package Exam14;

public class Member {

	private int num;
	private String userName;
	private String userEmail;
	private boolean gender;
	private int count;
	private String address;
	private int age;
	
	
	
	
	// getter�� private�� ���� �������� �����̰� setter�� ���� �޾Ƽ� ������ִ� ����
	//��� source���� generate getter and setter�� ������ �ڵ� ���� ����
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// source ���� toString ������ �ڵ� ������
	@Override
	public String toString() {
		return "Member [num=" + num + ", userName=" + userName + ", userEmail=" + userEmail + ", gender=" + gender
				+ ", count=" + count + ", address=" + address + ", age=" + age + "]";
	}
}
