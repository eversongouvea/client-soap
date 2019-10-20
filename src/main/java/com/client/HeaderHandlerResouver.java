package com.client;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class HeaderHandlerResouver implements HandlerResolver {

	public List<Handler> getHandlerChain(PortInfo portInfo) {
		
		List<Handler> handlers = new ArrayList(); 
		
		HeaderHandler hh = new HeaderHandler();
		
		handlers.add(hh);
		return handlers;
	}

}
