package com.ruby.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {
                  @ExceptionHandler(Exception.class)
	     	public ModelAndView processException(Exception ex) {
	     	 ModelAndView mv = new ModelAndView("exceptionPage");
	     	 mv.addObject("name", ex.getClass());
	     	 mv.addObject("msg", ex.getMessage());
	     	 return mv;
	     	}
                  @ExceptionHandler(UserDefinedException.class)
                  public ModelAndView processCustomException(UserDefinedException ude) {
                	  ModelAndView mv = new ModelAndView("exceptionPage");
         	     	 mv.addObject("name",ude.getName());
         	     	 mv.addObject("msg",ude.getMsg() );
         	     	 return mv;
                  }
	
	
}
