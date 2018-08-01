package com.mashensoft;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sword.wechat4j.oauth.OAuthException;
import org.sword.wechat4j.oauth.OAuthManager;
import org.sword.wechat4j.oauth.protocol.get_access_token.GetAccessTokenRequest;
import org.sword.wechat4j.oauth.protocol.get_access_token.GetAccessTokenResponse;
import org.sword.wechat4j.token.TokenProxy;

public class TodenTest {
	String at = "7_Ba6Nas6g-xzCkTr8Lgq6qwnNsDidTsh2r7JgwEbqnaxMb1uUDEw_DG2KbG4z_EL8dY9f9IfcDmYUdFyv4TBb2qUHhzuM-V6jW8hkoHvBr7_8nSB_LT80BcpF9SQjX7VAN-tkWed8IeNlBxzYSILjAFAGWZ";
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String at = TokenProxy.accessToken();
		System.out.println(at);
		//OAuthManager.generateRedirectURI(redirectURI, scope, state)
	}
	@Test
	public void test2() {
		//OAuthManager.generateRedirectURI(redirectURI, scope, state)
		String str = OAuthManager.generateRedirectURI("http://www.mashensoft.com/wzx/index.html", "snsapi_userinfo", "test info");
		System.out.println(str);
	}	
	@Test
	public void test21() {
		//OAuthManager.generateRedirectURI(redirectURI, scope, state)
		String str = OAuthManager.generateRedirectURI("http://www.mashensoft.com/wzx/a", "snsapi_userinfo", "test info");
		System.out.println(str);
	}	
	@Test
	public void test3() {
		//OAuthManager.generateRedirectURI(redirectURI, scope, state)
		System.out.println(123);
	}
	@Test
	public void test4() {
		System.out.println(123);
		//code:021Jv8mz0sD3Vg1zbioz0DW5mz0Jv8mn
		//021La8lB0Z2bOe2U9znB0SUZkB0La8lb
		 try {
			GetAccessTokenResponse getAccessTokenResponse = OAuthManager.getAccessToken(new GetAccessTokenRequest("021La8lB0Z2bOe2U9znB0SUZkB0La8lb"));
		} catch (OAuthException e) {
			e.printStackTrace();
		}
//		System.out.println(123);
	}

}
