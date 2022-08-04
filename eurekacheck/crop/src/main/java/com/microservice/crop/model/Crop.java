package com.microservice.crop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="crop")
public class Crop {
@Id
	String cropid;
    String cropName;
    String cropNo;
	public String getCropid() {
		return cropid;
	}
	public void setCropid(String cropid) {
		this.cropid = cropid;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getCropNo() {
		return cropNo;
	}
	public void setCropNo(String cropNo) {
		this.cropNo = cropNo;
	}
	@Override
	public String toString() {
		return "Crop [cropid=" + cropid + ", cropName=" + cropName + ", cropNo=" + cropNo + "]";
	}
    
    


	
}