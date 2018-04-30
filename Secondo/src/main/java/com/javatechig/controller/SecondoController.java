package com.javatechig.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class SecondoController {
	
	
    @RequestMapping(value = "/prova/{ciao}", method = RequestMethod.GET,headers="Accept=application/json")
    public String getDato(@PathVariable("ciao")String ciao) {
    	return "Tutto ok "+ciao;
    }
}
