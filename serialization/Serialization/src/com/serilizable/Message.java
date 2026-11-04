package com.serilizable;

import java.io.Serializable;

public class Message  implements Serializable{
	
	public static final long serialVersionUID=1L;
	
	private String Id;
	private String name;
	/**
	 * @param id
	 * @param name
	 */
	public Message(String id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
