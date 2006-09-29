package com.gruppotesi.foosball.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * 
 * FoosballService remote interface class
 *
 */  
public interface LoginServiceAsync 
{
	public void quickFoosball(AsyncCallback callback);
	// fucntion that uses serializable custom object
	public void login(Person person, AsyncCallback callback);
}
