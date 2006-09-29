package com.gruppotesi.foosball.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.gruppotesi.foosball.client.LoginService;
import com.gruppotesi.foosball.client.Person;


/*
 * Implementation class for FoosballService service.
 */
public class LoginServiceImpl extends RemoteServiceServlet implements LoginService 
{

	public String quickFoosball()
	{
		return "Foosball How are you?";
	}
	
	public String login(Person person)
	{		
		return "Foosball " + person.getTitle() + " " + person.getName();
	}
	
	public static final long serialVersionUID =  1;
}
