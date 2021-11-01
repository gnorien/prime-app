/**
 * 
 */
package com.gnorien.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gnorien
 *
 */
@Controller
public class WelcomeController {
	@RequestMapping(value="/")
    public String WelcomeController(ModelMap model){


        return "prime";
    }

}
