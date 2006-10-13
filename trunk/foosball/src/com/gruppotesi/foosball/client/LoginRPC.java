package com.gruppotesi.foosball.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.VerticalPanel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.gruppotesi.foosball.client.dto.UserDTO;

/**
 * 
 * RPC Demo composite class
 * 
 */
public class LoginRPC extends Composite 
{
	final VerticalPanel panel = new VerticalPanel();
    final TextBox textTitle = new TextBox();
    final TextBox textName = new TextBox();
    final Label labelRPC = new Label();    
    final Button buttonRPC = new Button("Foosball RPC");

    final String infoText = "Enter Your Name and Title... Click Foosball";
    final Label info = new Label(infoText);
    
    // FoosballService Service Endpoint
	LoginServiceAsync loginService = (LoginServiceAsync) GWT.create(LoginService.class);
	ServiceDefTarget endpoint = (ServiceDefTarget) loginService;

	public LoginRPC() 
	  {
		// Set endpoint to URL. Ensure FoosballConstants.LOGIN_SERVICE_URL is pointing 
		// to appropriate location
		endpoint.setServiceEntryPoint(FoosballConstants.LOGIN_SERVICE_URL);

		buttonRPC.addClickListener(new ClickListener() 
	    {
			// inline clicklistener
	        public void onClick(Widget sender) 
	        {
	      	 // inline callback functions
	      	 AsyncCallback callback = new AsyncCallback()
	      	 {
	      	    public void onSuccess(Object result) 
	      	    {
	      	          labelRPC.setText((String) result);
	      	          info.setText(infoText);
	      	    }

	      	    public void onFailure(Throwable caught) 
	      	    {
	      	      info.setText(caught.getMessage());
	      	    }
	      	  };
	      	  // invoke the service, the server will return response 
	      	  // by calling callback function onSuccess() 
	      	  loginService.login(new UserDTO(textTitle.getText(), textName.getText()), callback);    	
	        }
	      });		
		
			
	    panel.add(labelRPC);
	    panel.add(new Label("Title"));
	    panel.add(textTitle);
	    panel.add(new Label("Name"));
	    panel.add(textName);	    
	    panel.add(buttonRPC);
	    panel.add(info);
	  }
}
