package com.gruppotesi.foosball.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.gruppotesi.foosball.client.dto.UserDTO;

public class Login extends Composite 
{
	private final VerticalPanel panel = new VerticalPanel();
	private final TextBox userTextBox;
	private final PasswordTextBox passwordTextBox;
	private final Button login = new Button("Login");
	private UserDTO userDTO;

	LoginServiceAsync loginService = (LoginServiceAsync) GWT.create(LoginService.class);
	ServiceDefTarget endpoint = (ServiceDefTarget) loginService;
	
	public Login() 
	{	
		initWidget(panel);
		endpoint.setServiceEntryPoint(FoosballConstants.LOGIN_SERVICE_URL);
		
		//components
		userTextBox = new TextBox();
		passwordTextBox = new PasswordTextBox();
		
		//Creo il pulsante di Login
	    login.addClickListener(new ClickListener() 
	    {
			// inline clicklistener
	        public void onClick(Widget sender) 
	        {
	      	 // inline callback functions
	      	 AsyncCallback callback = new AsyncCallback()
	      	 {
	      	    public void onSuccess(Object result) 
	      	    {
	      	    	userDTO = (UserDTO)result;
	      	    	Window.alert("Utente "+userDTO.getUser());	
	      	    }

	      	    public void onFailure(Throwable caught) 
	      	    {
	      	    	Window.alert(FoosballConstants.LOGIN_FAILED);
	      	    }
	      	  };
	      	  // invoke the service, the server will return response 
	      	  // by calling callback function onSuccess() 
	      	  loginService.login(new UserDTO(userTextBox.getText(), passwordTextBox.getText()), callback);
	          String initToken = History.getToken();
	          Window.alert(initToken);
	        }
	      });
		
		panel.add(userTextBox);
		panel.add(passwordTextBox);
		panel.add(login);	
	}

}
