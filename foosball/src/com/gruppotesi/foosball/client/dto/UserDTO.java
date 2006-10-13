package com.gruppotesi.foosball.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * 
 * Serializable custom object
 *
 */
public class UserDTO implements IsSerializable 
{
	private String password;
	private String user;
    private String nome;
    private String cognome;
    
	  
	public UserDTO()
	{
		super();	
	}
	
	public UserDTO(String user, String password)
	{
		super();
		
		this.user = user;
		this.password = password;
	}
	
	public String getUser() 
	{
		return user; 
	}
	public void setUser(String user) 
	{
		this.user = user;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
}


