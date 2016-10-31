package com.xmx.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * index controller
 * @author Administrator
 *
 */
@Controller
public class IndexController {
	
	
	
	
	/**
	 * index
	 * @return
	 */
	@RequestMapping("/index.htm")
	public String index(){
		
		
		return "index/index";
		
	}
			
			
	

}
