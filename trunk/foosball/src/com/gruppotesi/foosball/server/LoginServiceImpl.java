package com.gruppotesi.foosball.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.gruppotesi.foosball.client.LoginService;
import com.gruppotesi.foosball.client.dto.UserDTO;


/*
 * Implementation class for FoosballService service.
 */
public class LoginServiceImpl extends RemoteServiceServlet implements LoginService
{

	public UserDTO login(UserDTO userDTO) throws Exception
	{		
		if (userDTO.getUser() == null || userDTO.getUser().equals(""))
		{
			throw new Exception();
		}
		return new UserDTO(userDTO.getUser(), userDTO.getPassword());
	}
	
	public static final long serialVersionUID =  1;
}
