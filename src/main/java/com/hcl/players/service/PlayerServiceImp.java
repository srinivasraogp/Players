package com.hcl.players.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.players.entity.Player;
import com.hcl.players.pojo.PlayerReqDto;
import com.hcl.players.pojo.PlayerResDto;
import com.hcl.players.repository.PlayerRepository;

@Service
public class PlayerServiceImp implements PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public PlayerResDto playerDetails(Long playerId) {
		return null;
	}
	
	
	public PlayerResDto save(PlayerReqDto playerReqDto) {
			
		PlayerResDto playerResDto = new PlayerResDto();
		Player player=new Player();
		
		BeanUtils.copyProperties(playerReqDto, player);
	
		Player playerres = playerRepository.save(player);
		BeanUtils.copyProperties(playerres, playerResDto);
		return playerResDto;
	}	
	
		
	}

