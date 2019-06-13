package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.MyProperties;
import com.example.demo.models.TestUser;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
    	MyProperties myProperties = new MyProperties();
        System.out.println("1");
        return myProperties.getDescription();
    }
    
    @RequestMapping("/getUser")
    public TestUser geTestUser() {
    	TestUser user = new TestUser();
    	user.setName("xiaoming");
    	user.setPassword("12345");
    	user.setIntLst(new int[] {1,2,3,4});
    	return user;
    }
}

