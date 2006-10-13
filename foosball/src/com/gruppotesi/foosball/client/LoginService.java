package com.gruppotesi.foosball.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.gruppotesi.foosball.client.dto.UserDTO;

/**
 * 
 * FoosballService remote interface class
 *
 */  
public interface LoginService extends RemoteService 
{
	// fucntion that uses serializable custom object
	UserDTO login(UserDTO userDTO) throws Exception;
}
