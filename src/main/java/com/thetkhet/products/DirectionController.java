package com.thetkhet.products;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DirectionController {
  @GetMapping("/")
	public String index()
 {
	 return "index";
 }
  @GetMapping("/prodlist")
 public String prodlist()
 {
	 return"prodlist";
 }
 
}
