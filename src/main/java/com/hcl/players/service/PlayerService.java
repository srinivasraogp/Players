package com.hcl.players.service;

import com.hcl.players.pojo.PlayerReqDto;
import com.hcl.players.pojo.PlayerResDto;

public interface PlayerService {

	

	PlayerResDto playerDetails(Long playerId);
	

	PlayerResDto save(PlayerReqDto playerReqDto);
	

}
