package com.bit2016.mysite.action.guestmain;


import com.bit2016.web1.Action;
import com.bit2016.web1.Actionfactory;

public class GuestMainFactory extends Actionfactory {

	@Override
	public Action getAction(String actionName) {
		// TODO Auto-generated method stub
		Action action=null;
		if("add".equals(actionName)){
			action=new AddAction();
		}else
		{
			action=new ListAction();
		}
		return action;
		
	}

}
