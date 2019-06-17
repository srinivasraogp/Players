package com.hcl.players.testContoller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.players.controller.PlayerController;
import com.hcl.players.entity.Player;
import com.hcl.players.pojo.PlayerReqDto;
import com.hcl.players.pojo.PlayerResDto;
import com.hcl.players.service.PlayerService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = PlayerController.class, secure = false)
public class PlayerControllerTest {

	@Autowired
	MockMvc mockMvc;
	@MockBean
	private PlayerService playerService;

	@Test
	public void createPlayer() throws Exception {

		Player player = new Player();
		PlayerReqDto playerReqDto = new PlayerReqDto();
		PlayerResDto playerResDto = new PlayerResDto();
		
		playerReqDto.setPlayerId(1L);
		playerReqDto.setPlayerName("Sachin");
		playerReqDto.setPlayerAge(45);
		playerReqDto.setPlayerPoints(90.0);
		playerReqDto.setPlayerRole("BatsMan");
		playerReqDto.setPlayerState("mumbai");
		
		Mockito.when(playerService.save(playerReqDto)).thenReturn(playerResDto);

		mockMvc.perform(post("/api/create").contentType(MediaType.APPLICATION_JSON).content(asJsonString(player)))
				.andExpect(status().isCreated());
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
