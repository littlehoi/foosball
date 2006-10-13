package com.gruppotesi.foosball.client;

import com.gruppotesi.foosball.client.dto.UserDTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * 
 * FoosballService remote interface class
 *
 */  
public interface LoginServiceAsync 
{
	// fucntion that uses serializable custom object
	void login(UserDTO userDTO, AsyncCallback callback);
}
