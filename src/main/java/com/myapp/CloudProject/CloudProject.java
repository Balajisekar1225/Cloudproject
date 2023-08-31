package com.myapp.CloudProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudProject {
	@GetMapping (value="admin") 
		public String getvalue() {
			return "Welcome to My Api";
		}
	}

