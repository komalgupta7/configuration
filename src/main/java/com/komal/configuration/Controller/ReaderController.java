package com.komal.configuration.Controller;



import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.komal.configuration.core.ConfigurationReader;
import com.komal.configuration.core.ConfigurationReaderFactory;

@RestController
@RequestMapping(value = "get/configuration", produces=MediaType.APPLICATION_JSON_VALUE )
public class ReaderController {

	@RequestMapping(value = "/" , method=RequestMethod.POST)
	public ConfigurationResponse requestedData(@Validated @RequestBody ConfigurationReadRequest request)
	{
		   ConfigurationReader reader = ConfigurationReaderFactory.getReader(request.type.toUpperCase());
		   return new ConfigurationResponse().setResult(reader.read(request.destination));
		
	}
	
}
