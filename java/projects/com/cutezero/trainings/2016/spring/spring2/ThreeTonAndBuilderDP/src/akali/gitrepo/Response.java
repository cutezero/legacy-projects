package akali.gitrepo;

import java.util.Map;

public class Response {

	protected int statusCode;
	protected Map<String, String> headers;
	protected Map<String, NewCookie> cookies;
	protected Object entity;
	
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public Map<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	public Map<String, NewCookie> getCookies() {
		return cookies;
	}
	public void setCookies(Map<String, NewCookie> cookies) {
		this.cookies = cookies;
	}
	public Object getEntity() {
		return entity;
	}
	public void setEntity(Object entity) {
		this.entity = entity;
	}
	
	
}
