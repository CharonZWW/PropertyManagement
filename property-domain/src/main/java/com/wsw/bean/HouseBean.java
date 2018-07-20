package com.wsw.bean;

import java.sql.Date;

//房屋信息表
public class HouseBean {
     
	//房屋id
	private int h_id;
	
	//门牌号
	private String  h_number;
	
	//户主名字
	private String holderName;
	
	//联系电话
	private String contactNumber;
	
	//房屋面积
	private double h_area;
	
	//物业费到期时间
	private Date propertyFeeExpirationDate;
	
	//水费
	private double waterFee ;
	
	
	 
	
	

	public int getH_id() {
		return h_id;
	}

	public void setH_id(int h_id) {
		this.h_id = h_id;
	}

	public String getH_number() {
		return h_number;
	}

	public void setH_number(String h_number) {
		this.h_number = h_number;
	}
	

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public double getH_area() {
		return h_area;
	}

	public void setH_area(double h_area) {
		this.h_area = h_area;
	}

	public Date getRealDate() {
		return propertyFeeExpirationDate;
	}

	public void setRealDate(Date propertyFeeExpirationDate) {
		this.propertyFeeExpirationDate = propertyFeeExpirationDate;
	}

	public double getWateFee() {
		return waterFee;
	}

	public void setWateFee(double waterFee) {
		this.waterFee = waterFee;
	}

	@Override
	public String toString() {
		return "HouseBean [h_id=" + h_id + ", h_number=" + h_number + ", holderName=" + holderName + ", contactNumber="
				+ contactNumber + ", h_area=" + h_area + ", realDate=" + propertyFeeExpirationDate + ", wateFee=" + waterFee + "]";
	}


	
	
	
	
	
	
}
