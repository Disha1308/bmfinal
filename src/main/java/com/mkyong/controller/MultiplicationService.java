package com.mkyong.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class MultiplicationService {
 
	static long count;
    Map<Long, Numbers> numberlog = new HashMap<Long, Numbers>();

    @RequestMapping(value = "/")
    public ModelAndView showForm() {
    	System.out.println("in default get");
        return new ModelAndView("multiply", "Numbers", new Numbers());
    
    }


    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    public String submit( @ModelAttribute("Numbers") final Numbers noobject, final BindingResult result, final ModelMap model) {
    	
    	int no1 =noobject.getNumber1();
    	int no2 = noobject.getNumber2();
    	
    	System.out.println("in multiply post");

        model.addAttribute("number1",no1 );
        model.addAttribute("number2", no2);
    	if (no1<8 && no1>-8 && no2<8 && no2>-8) {
            noobject.BoothsMultiplication();
            model.addAttribute("result", noobject.getResult());
            numberlog.put(count++, noobject);
        }
    	else
    	{

            model.addAttribute("result", "");
    		model.addAttribute("error", "Enter valid numbers");
    	}
        return "multiply";
    }
}