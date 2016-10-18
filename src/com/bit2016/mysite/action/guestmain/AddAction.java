package com.bit2016.mysite.action.guestmain;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2016.mysite.guestbook.dao.GuestbookDao;
import com.bit2016.mysite.guestbook.vo.GuestbookVo;
import com.bit2016.web.util.WebUtil;
import com.bit2016.web1.Action;

public class AddAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String pass=request.getParameter("passwd");
		String context=request.getParameter("context");
		
		GuestbookVo vo=new GuestbookVo();
		vo.setName(name);
		vo.setPasswd(pass);
		vo.setContext(context);
		
		GuestbookDao dao=new GuestbookDao();
		dao.insert(vo);
		System.out.println(name);
		WebUtil.redirect(request, response, "/mysite3/guestbook");
		
		
		

	}

}
