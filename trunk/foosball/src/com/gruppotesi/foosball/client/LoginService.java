package com.gruppotesi.foosball.client;

import com.google.gwt.user.client.rpc.RemoteService;

/**
 * 
 * FoosballService remote interface class
 *
 */  
public interface LoginService extends RemoteService 
{
	public String quickFoosball();
	// fucntion that uses serializable custom object
	public String login(Person person);
}
