package com.hcl.players.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class PlayerReqDto {
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

}
