package com.gruppotesi.foosball.client;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * 
 * Serializable custom object
 *
 */
public class Person implements IsSerializable 
{
	  
	public Person(){}
	
	public Person(String title, String name)
	{
		this.title = title;
		this.name = name;
	}
	
	public String getName() {
		return name; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	  private String title;
	  private String name;

}


