package com.gruppotesi.foosball.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Foosball implements EntryPoint
{ 
	private RootPanel root = RootPanel.get();
	private HorizontalPanel panel = new HorizontalPanel();
	private Login login = new Login();	
	private MenuComp menuComp = new MenuComp();
	
  /**
   * This is the entry point method.
   */
  public void onModuleLoad() 
  {
	  panel.setHorizontalAlignment(HorizontalPanel.ALIGN_LEFT);
	  panel.setSpacing(10);
	  panel.add(menuComp); //commented out: causes problems with the design tab.
	  panel.add(login);//commented out: causes problems with the design tab.
	  root.add(panel);	  
  }
}
