package com.bit2016.mysite.action.guestmain;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2016.mysite.guestbook.dao.GuestbookDao;
import com.bit2016.mysite.guestbook.vo.GuestbookVo;
import com.bit2016.web.util.WebUtil;
import com.bit2016.web1.Action;

public class ListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("list");
		// TODO Auto-generated method stub
		GuestbookDao dao = new GuestbookDao();
		List<GuestbookVo> list = dao.getList();
		
		request.setAttribute( "list", list );
		WebUtil.forward(
			request,
			response,
			"/WEB-INF/views/guestbook/list.jsp" );
	}
}
