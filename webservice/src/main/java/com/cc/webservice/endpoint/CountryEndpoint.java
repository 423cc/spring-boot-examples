package com.cc.webservice.endpoint;

import com.baeldung.springsoap.gen.GetCountryRequest;
import com.baeldung.springsoap.gen.GetCountryResponse;
import com.cc.webservice.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * @author chaocui
 * @description
 * @date created at 12/30/2019 10:11
 */

@Endpoint
public class CountryEndpoint {

	private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

	@Autowired
	private CountryRepository countryRepository;

	@PayloadRoot(namespace = NAMESPACE_URI,localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request){
		GetCountryResponse response =new GetCountryResponse();
		response.setCountry(countryRepository.findCountry(request.getName()));

		return response;
	}
}
