package com.cc.webservice;

import com.baeldung.springsoap.gen.Country;
import com.baeldung.springsoap.gen.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chaocui
 * @description
 * @date created at 12/30/2019 10:09
 */

@Component
public class CountryRepository {

	private static final Map<String, Country> countries =new HashMap<>();

	@PostConstruct
	public void initData(){
		Country spain = new Country();
		spain.setName("Spain");
		spain.setCapital("Madrid");
		spain.setCurrency(Currency.EUR);
		spain.setPopulation(46704314);

		countries.put(spain.getName(), spain);
	}

	public Country findCountry(String name){
		return countries.get(name);
	}
}
