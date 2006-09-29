package com.gruppotesi.foosball.client;

import com.google.gwt.core.client.GWT;

/**
 * Class encapsulating URL differences between Tomcat and GWT Hosted Environment 
 */
public final class FoosballConstants 
{
 
	// Foosball Service URL for Tomcat 
	//public static final String LOGIN_SERVICE_URL = GWT.getModuleBaseURL() + "/login";
	
	// Foosball Service URL for GWT Hosted Environment
	public static final String LOGIN_SERVICE_URL = "/login";
}
