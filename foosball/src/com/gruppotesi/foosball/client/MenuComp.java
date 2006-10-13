package com.gruppotesi.foosball.client;

import com.google.gwt.user.client.History;
import com.google.gwt.user.client.HistoryListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MenuComp extends Composite
{
	private final VerticalPanel panel = new VerticalPanel();
	//private Label lbl = new Label();	

	public MenuComp()
	{
		initWidget(panel);
		
		Hyperlink link0 = new Hyperlink("Login", "Login");
	    Hyperlink link1 = new Hyperlink("link to bar", "bar");
	    Hyperlink link2 = new Hyperlink("link to baz", "baz");
	    
		panel.add(link0);
		panel.add(link1);
		panel.add(link2);
	}
}