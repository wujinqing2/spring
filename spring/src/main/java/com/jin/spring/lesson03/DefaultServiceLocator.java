package com.jin.spring.lesson03;

public class DefaultServiceLocator {
	private static ClientService clientService = new ClientServiceImpl();
    private DefaultServiceLocator() {}

    public ClientService createClientServiceInstance() {
        return clientService;
    }
}
