package Exam14;

public class Member {

	private int num;
	private String userName;
	private String userEmail;
	private boolean gender;
	private int count;
	private String address;
	private int age;
	
	
	
	
	// getter은 private의 값을 가져오는 느낌이고 setter는 값을 받아서 출력해주는 느낌
	//상단 source에서 generate getter and setter를 누르면 자동 생성 가능
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
	
	// source 에서 toString 누르면 자동 생성됨
	@Override
	public String toString() {
		return "Member [num=" + num + ", userName=" + userName + ", userEmail=" + userEmail + ", gender=" + gender
				+ ", count=" + count + ", address=" + address + ", age=" + age + "]";
	}
}
