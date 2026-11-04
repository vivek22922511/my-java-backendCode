package com.serilizablePractice;

import java.io.Serializable;

public class Information  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String gunId;
	String gunName;
	/**
	 * @param gunId
	 * @param gunName
	 */
	public Information(String gunId, String gunName) {
		super();
		this.gunId = gunId;
		this.gunName = gunName;
	}
	public String getGunId() {
		return gunId;
	}
	public void setGunId(String gunId) {
		this.gunId = gunId;
	}
	public String getGunName() {
		return gunName;
	}
	public void setGunName(String gunName) {
		this.gunName = gunName;
	}
	
}
