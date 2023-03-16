package com.baeldung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dummy")
public class DummyController {

	@Autowired
	private Environment env;
	
	@RequestMapping("propertysource")
	public void testDummy() {
		
		//Properties added to Environment bcz of @PropertySource annotation
		System.out.println("user: "+env.getProperty("java.jdbc.user"));
	}
}
