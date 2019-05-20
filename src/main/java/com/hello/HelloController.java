/**
 * 
 */
package com.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello()
	{
		return "hello bro";
	}
}
