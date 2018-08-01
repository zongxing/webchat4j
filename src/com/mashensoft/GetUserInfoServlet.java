package com.mashensoft;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sword.wechat4j.oauth.OAuthException;
import org.sword.wechat4j.oauth.OAuthManager;
import org.sword.wechat4j.oauth.protocol.get_access_token.GetAccessTokenRequest;
import org.sword.wechat4j.oauth.protocol.get_access_token.GetAccessTokenResponse;
import org.sword.wechat4j.oauth.protocol.get_userinfo.GetUserinfoRequest;
import org.sword.wechat4j.oauth.protocol.get_userinfo.GetUserinfoResponse;

/**
 * Servlet implementation class GetUserInfoServlet
 */
@WebServlet("/a")
public class GetUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetUserInfoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String url = OAuthManager.generateRedirectURI("http://www.mashensoft.com/a.jsp", "snsapi_userinfo", "test info");
		
		String code = request.getParameter("code");
		System.out.println("code:"+code);
		response.setContentType("text/html;charset=UTF-8");
		try {
			 GetAccessTokenResponse getAccessTokenResponse = OAuthManager.getAccessToken(new GetAccessTokenRequest(code));
			GetUserinfoResponse getUserinfoResponse =   OAuthManager.getUserinfo(new GetUserinfoRequest(getAccessTokenResponse.getAccess_token(),getAccessTokenResponse.getOpenid()));
			System.out.println("getOpenid:"+getUserinfoResponse.getOpenid());
			System.out.println("getNickname:"+getUserinfoResponse.getNickname());
			response.getWriter().print("getOpenid:"+getUserinfoResponse.getOpenid());
			response.getWriter().print("getNickname:"+getUserinfoResponse.getNickname());
			response.getWriter().print("all:"+getUserinfoResponse);
		} catch (OAuthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
