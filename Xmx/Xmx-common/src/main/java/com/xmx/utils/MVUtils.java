package com.xmx.utils;

import org.springframework.web.servlet.ModelAndView;

/**
 * ModelAndViewUtils
 * @author Administrator
 *
 */
public class MVUtils {
	
	
	/**
	 * @param viewName
	 * @return
	 */
	public static ModelAndView instance(String viewName){
		return new ModelAndView(viewName);
	}
	
	
	
	

}
