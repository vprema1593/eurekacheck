package com.springboot.springbootcrudoperation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="farmer")
public class Farmer {
@Id
String farmerid;
String farmerName;
String farmerNo;
public String getFarmerid() {
	return farmerid;
}
public void setFarmerid(String farmerid) {
	this.farmerid = farmerid;
}
public String getFarmerName() {
	return farmerName;
}
public void setFarmerName(String farmerName) {
	this.farmerName = farmerName;
}
public String getFarmerNo() {
	return farmerNo;
}
public void setFarmerNo(String farmerNo) {
	this.farmerNo = farmerNo;
}
@Override
public String toString() {
	return "Farmer [farmerid=" + farmerid + ", farmerName=" + farmerName + ", farmerNo=" + farmerNo + "]";
}


	
}
