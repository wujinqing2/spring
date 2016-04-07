package com.jin.spring.lesson02;

public class MessageAction {
	private MessageService messageService;
	
	public void printMessage()
	{
		System.out.println(messageService.getMessage());
	}

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
}
