package com.dlsm.structs.sample.action;

import com.dlsm.struts.sample.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
private static final long serialVersionUID = 1L;
   
    private MessageStore messageStore;
    private static int helloCount = 0;
	
    public int getHelloCount() {
    	return helloCount;
    }

    public void setHelloCount(int helloCount) {
    	HelloWorldAction.helloCount = helloCount;
    }    
    public String execute() throws Exception {
    	helloCount++; 
        messageStore = new MessageStore() ;
        return SUCCESS;
    }
 
    public MessageStore getMessageStore() {
        return messageStore;
    }
 
    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
}
