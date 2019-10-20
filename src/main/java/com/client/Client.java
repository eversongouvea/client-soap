package com.client;

import com.client.server.CustomerPort;
import com.client.server.CustomerPortService;
import com.client.server.GetCustomerDetailRequest;
import com.client.server.GetCustomerDetailResponse;

public class Client {

	public static void main(String[] args) {
	
		CustomerPortService service = new CustomerPortService();
		
		service.setHandlerResolver(new HeaderHandlerResouver());
	
		CustomerPort port = service.getCustomerPortSoap11();
		
		GetCustomerDetailRequest customerRequest = new GetCustomerDetailRequest();
		customerRequest.setId(1);
		
		GetCustomerDetailResponse customerResponse = port.getCustomerDetail(customerRequest);
		
		System.out.println("id -> " + customerResponse.getCustomeDetailResponse().getId());
		System.out.println("nome -> " + customerResponse.getCustomeDetailResponse().getName());
		System.out.println("email -> " + customerResponse.getCustomeDetailResponse().getEmail());
		System.out.println("telefone -> " + customerResponse.getCustomeDetailResponse().getTelefone());
	}

}
