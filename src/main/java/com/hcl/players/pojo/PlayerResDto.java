package com.hcl.players.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class PlayerResDto implements Serializable {

	private Long playerId;
	@JsonProperty
	private String playerName;
	@JsonProperty
	private String playerState;
	@JsonProperty
	private int playerAge;
	@JsonProperty
	private String playerRole;
	@JsonProperty
	private Double playerPoints;
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerState() {
		return playerState;
	}
	public void setPlayerState(String playerState) {
		this.playerState = playerState;
	}
	public int getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	public String getPlayerRole() {
		return playerRole;
	}
	public void setPlayerRole(String playerRole) {
		this.playerRole = playerRole;
	}
	public Double getPlayerPoints() {
		return playerPoints;
	}
	public void setPlayerPoints(Double playerPoints) {
		this.playerPoints = playerPoints;
	}
	

}
