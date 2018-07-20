package com.wsw.bean;

//账户
public class AccountBean {
     
	//账户id
	private int a_id;
	
	//房屋
	private HouseBean house;
	
	//用户名(手机号)
	private String phoneNumber;
	
	//密码
	private String passWord;
	


	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public HouseBean getHouse() {
		return house;
	}

	public void setHouse(HouseBean house) {
		this.house = house;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "AccountBean [a_id=" + a_id + ", house=" + house + ", phoneNumber=" + phoneNumber + ", passWord="
				+ passWord + "]";
	}


	


	
	
	
}
