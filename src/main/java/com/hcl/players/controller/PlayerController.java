package com.hcl.players.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders= {"*", "*/"}, origins = {"*", "*/"})
public class PlayerController {
	private Logger logger = LoggerFactory.getLogger(PlayerController.class);

}
