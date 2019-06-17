package com.hcl.players.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.players.pojo.PlayerResDto;
import com.hcl.players.repository.PlayerRepository;

@Service
public class PlayerServiceImp implements PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public PlayerResDto playerDetails(Long playerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
		
	}

