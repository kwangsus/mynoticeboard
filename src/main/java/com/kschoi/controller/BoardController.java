package com.kschoi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class BoardController {
	@RequestMapping
	public void mainHome() {
		log.info("");
		}
	
}