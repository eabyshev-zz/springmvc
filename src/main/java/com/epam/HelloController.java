package com.epam;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController
{
    @RequestMapping( value = "/" )
    public String sayHello( ModelMap model )
    {
        model.addAttribute( "greeting", "Hello from Spring MVC 4" );
        return "test";
    }


    @RequestMapping( value = "/helloagain", method = RequestMethod.GET )
    public String sayHelloAgain( ModelMap model )
    {
        model.addAttribute( "greeting", "Hello again, from Spring MVC 4" );
        return "test";
    }
}
