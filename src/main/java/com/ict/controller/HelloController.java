package com.ict.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class HelloController
{
	// 메소드 만들때는 이름과 인자는 내마음대로
	/*@RequestMapping(value = "hello.do", method = RequestMethod.GET)
	public ModelAndView HelloCommand()
	{
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("msg", "GET방식");
		return mv;
	}*/
	
	/*@RequestMapping(value = "hello.do", method = RequestMethod.POST)
	public ModelAndView Hello2Command()
	{
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("msg", "GET방식");
		return mv;
	}*/
	/*@RequestMapping("hello.controller")
	public ModelAndView Hello3Command()
	{
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("msg", "GET방식");
		return mv;
	}*/
}
