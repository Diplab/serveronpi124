package com.diplab.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

import com.diplab.service.ACService;
import com.diplab.service.SwitchService;
import com.diplab.serviceImp.ACServiceImpl;
import com.diplab.serviceImp.SwitchServiceImpl;
import com.pi4j.io.gpio.PinState;

@WebService
@SOAPBinding(style = Style.RPC)
public class Device124 {

	SwitchService switchService = new SwitchServiceImpl();
	ACService acService = new ACServiceImpl();
	
	@WebMethod
	public void off() {
		switchService.off();
	}

	@WebMethod
	public void on() {
		switchService.on();
	}

	@WebMethod
	public void toggle() {
		switchService.toggle();
	}

	@WebMethod
	public PinState getState() {
		return switchService.getState();
	}

	@WebMethod
	public void executeAC() {
		acService.executeAC();
	}
	
	@WebMethod
	public void ACstateAgain() {
		acService.ACstateAgain();
	}
	
	@WebMethod
	public void setACtemperature20() {
	    acService.setACtemperature20();	    
	}

	@WebMethod
	public void setACtemperature21() {
	    acService.setACtemperature21();   
	}

	@WebMethod
	public void setACtemperature22() {
	    acService.setACtemperature22();
	}

	@WebMethod
	public void setACtemperature23() {
	    acService.setACtemperature23();    
	}

	@WebMethod
	public void setACtemperature24() {
	    acService.setACtemperature24();  
	}

	@WebMethod
	public void setACtemperature25() {
	    acService.setACtemperature25();   
	}

	@WebMethod
	public void setACtemperature26() {
	    acService.setACtemperature26();  
	}

	@WebMethod
	public void setACtemperature27() {
	    acService.setACtemperature27();    
	}

	@WebMethod
	public void setACtemperature28() {
	    acService.setACtemperature28();    
	}

	@WebMethod
	public void setACtemperature29() {
	    acService.setACtemperature29();    
	}

	@WebMethod
	public void setACtemperature30() {
	    acService.setACtemperature30();   
	}

	@WebMethod
	public void setACtime2() {
	    acService.setACtime2();  
	}

	@WebMethod
	public void setACtime3() {
	    acService.setACtime3();    
	}

	@WebMethod
	public void setACtime4() {
	    acService.setACtime4();  
	}

	@WebMethod
	public void setACtime5() {
	    acService.setACtime5();
	}

	@WebMethod
	public void setACtime8() {
	    acService.setACtime8();  
	}

	@WebMethod
	public void setACtime10() {
	    acService.setACtime10();    
	}

	@WebMethod
	public void setACtime12() {
	    acService.setACtime12();    
	}

	@WebMethod
	public void setACtimeclear() {
	    acService.setACtimeclear();    
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://0.0.0.0:9005/webservice/Device124",
				new Device124());

		System.out.println("open webservice124");

	}

}
