package com.diplab.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

import com.diplab.service.ACService;
import com.diplab.service.CO2Service;
import com.diplab.serviceImp.ACServiceImpl;
import com.diplab.serviceImp.CO2ServiceImpl;

@WebService
@SOAPBinding(style = Style.RPC)
public class Device124 {

	CO2Service co2Service = new CO2ServiceImpl();
	ACService acService = new ACServiceImpl();

	@WebMethod
	public double CO2ppm() {
		return co2Service.CO2ppm();
	}

	@WebMethod
	public void executeAC() {
		acService.executeAC();
	}

	public static void main(String[] args) {
		Endpoint.publish("http://0.0.0.0:9005/webservice/Device124",
				new Device124());

		System.out.println("open webservice124 Escape");

	}

}
