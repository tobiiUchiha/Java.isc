package builder;

public class HttpConnection {
	
	private String url;
	private int port;
	private String user;
	private String password;
	private int timeout;
	
	
	private HttpConnection(Builder builder) {
		this.url = builder.url;
		this.port = builder.port;
		this.user = builder.user;
		this.password = builder.password;
		this.timeout = builder.timeout;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	
	@Override
	public String toString() {
		return "Builder [url=" + url + ", port=" + port + ", user=" + user + ", password=" + password + ", timeout="
				+ timeout + "]";
	}
	
	public static class Builder {
		private String url;
		private int port;
		private String user;
		private String password;
		private int timeout;
		
		public Builder Url(String url) {
			this.url = url;
			return this;
		}
		
		public Builder Port(int port) {
			this.port = port;
			return this;	
	}
		
		public Builder User(String user) {
			this.user = user;
			return this;
		}
		
		public Builder Password(String password) {
			this.password = password;
			return this;
			
		}
		
		public Builder Timeout(int timeout) {
			this.timeout = timeout;
			return this;
		}
		

		public HttpConnection build() {
			if (!(url.startsWith("http://"))) {
				throw new IllegalArgumentException("url should start with 'http://'.");
				}
			
			return new HttpConnection(this);
			
		}
	
	}
}

