package com.client;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class HeaderHandler implements SOAPHandler<SOAPMessageContext>{

	public boolean handleMessage(SOAPMessageContext context) {
		
		Boolean outBoundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(outBoundProperty){
			try {
				
				SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
				SOAPHeader header = envelope.getHeader();
				
				SOAPElement securety = header.addChildElement("Security","wsse","http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
				
				SOAPElement userNameToken = securety.addChildElement("UsernameToken","wsse");
				
				SOAPElement userName = userNameToken.addChildElement("Username","wsse");
				userName.addTextNode("everson");
				
				SOAPElement passWord = userNameToken.addChildElement("Password","wsse");
				passWord.addTextNode("123");
				
			} catch (SOAPException e) {
				e.printStackTrace();
			}
		}
		return outBoundProperty;
	}

	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
