package cn.framework.exception;

public class ExceptionCause {

	private String messageKey;
	private Object[] messageArgs;
	private boolean resource;
	private int index;

	public ExceptionCause() {
		this.messageKey = null;
		this.messageArgs = null;
		this.resource = false;
		this.index = -1;
	}

	public ExceptionCause(String messageKey) {
		this(messageKey, true);
	}

	public ExceptionCause(String messageKey, boolean resource) {
		this.messageKey = null;
		this.messageArgs = null;
		this.resource = false;
		this.index = -1;
		this.messageKey = messageKey;
		this.resource = resource;
	}

	public ExceptionCause(String messageKey, Object messageArgs) {
		this(messageKey, new Object[]{messageArgs});
	}

	public ExceptionCause(String messageKey, Object[] messageArgs) {
		this.messageKey = null;
		this.messageArgs = null;
		this.resource = false;
		this.index = -1;
		this.messageKey = messageKey;
		this.messageArgs = (Object[]) messageArgs.clone();
		this.resource = true;
	}

	public Object[] getMessageArgs() {
		return this.messageArgs;
	}

	public void setMessageArgs(Object[] messageArgs) {
		this.messageArgs = (Object[]) messageArgs.clone();
	}

	public String getMessageKey() {
		return this.messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public boolean isResource() {
		return this.resource;
	}

	public void setResource(boolean resource) {
		this.resource = resource;
	}

	public int getIndex() {
		return this.index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
