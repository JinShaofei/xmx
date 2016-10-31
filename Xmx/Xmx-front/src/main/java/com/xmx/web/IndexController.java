package com.xmx.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xmx.utils.MVUtils;

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
	public ModelAndView index(){
		
		
		String viewName = "index/index";
		
		return MVUtils.instance(viewName);
		
	}
			
			
	

}
