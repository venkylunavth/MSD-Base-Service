package com.BasePackage.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BaseController {

	private RestTemplate restTemplate;

	@GetMapping("/getbooks")
	public String getBooks() {
		System.out.println("Called");
		restTemplate = new RestTemplate();
		String message = restTemplate.getForObject("http://localhost:8090/getbooks", String.class);
		return message;
	}

	/*
	 * //add gateways
	 * 
	 * @GetMapping("/addbook") public String addBook(int id, String name,String
	 * author) { restTemplate=new RestTemplate(); String
	 * message=restTemplate.getForObject("http://localhost:8090/addbooks?id="+id+
	 * "&name="+name+"&author="+author, String.class); return message;
	 * 
	 * }
	 */
	@GetMapping("/getcustomer")
	public String getCustomer() {
		System.out.println("Called");
		restTemplate = new RestTemplate();
		String test = restTemplate.getForObject("http://localhost:8091/getcustomer", String.class);
		return test;
	}

	/*
	 * // add gateways
	 * 
	 * @GetMapping("/addcustomer") public String addBook(int id, String name, String
	 * email, String mobile) { restTemplate = new RestTemplate(); String test =
	 * restTemplate.getForObject( "http://localhost:8091/addcustomer?id=" + id +
	 * "&name=" + name + "&email=" + email + "&mobile" + mobile, String.class);
	 * return test; }
	 */
}
