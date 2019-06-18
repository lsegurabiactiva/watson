package base.components;

public class BiactivaEx extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String internalMessage;
	private String userMesagge;
	private Integer responseCode;
	public BiactivaEx(String internalMessage,String userMesagge, Integer responseCode){
		super(internalMessage);
		this.internalMessage=internalMessage;
		this.userMesagge=userMesagge;
		this.responseCode=responseCode;
	}
	public String getInternalMessage() {
		return internalMessage;
	}
	public void setInternalMessage(String internalMessage) {
		this.internalMessage = internalMessage;
	}
	public String getUserMesagge() {
		return userMesagge;
	}
	public void setUserMesagge(String userMesagge) {
		this.userMesagge = userMesagge;
	}
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	
	
}
