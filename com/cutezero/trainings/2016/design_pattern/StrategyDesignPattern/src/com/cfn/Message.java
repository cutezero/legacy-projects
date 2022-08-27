package com.cfn;

public class Message {
	private String type;
	private int size;
	private String content;
	public Message(String type, int size, String content) {
		super();
		this.type = type;
		this.size = size;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Message [type=" + type + ", size=" + size + ", content=" + content + "]";
	}
	public String getType() {
		return type;
	}
	public int getSize() {
		return size;
	}
	public String getContent() {
		return content;
	}
	
	
}
