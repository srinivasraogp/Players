package com.hcl.players.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.players.pojo.PlayerResDto;
import com.hcl.players.service.PlayerService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class PlayerController {
	private Logger logger = LoggerFactory.getLogger(PlayerController.class);

	@Autowired
	private PlayerService playerService;

	@GetMapping("/player/{playerId}")

	public ResponseEntity<PlayerResDto> getPlayerDetails(@PathVariable Long playerId) {
		PlayerResDto playerResDto=playerService.playerDetails(playerId);
		 return new ResponseEntity<>(playerResDto,HttpStatus.OK);
		 
	}
}
